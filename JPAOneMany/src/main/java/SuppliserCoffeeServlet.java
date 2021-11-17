
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Coffee;
import model.Supplier;

/**
 * Servlet implementation class SuppliserCoffeeServlet
 */
@WebServlet("/SuppliserCoffeeServlet")
public class SuppliserCoffeeServlet extends HttpServlet {

	void add() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAOneMany");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();// 通常用在資料異動，只有新增修改刪除時才需要

		Supplier sp = new Supplier();
		sp.setCity("Taipei");
		sp.setSupName("jane");
		sp.setState("TW");
		sp.setStreet("Kauy sos road");
		sp.setZip("101");
		sp.setSupId(1);

		Coffee c1 = new Coffee();
		c1.setCofName("Flavor A");
		c1.setPrice(new BigDecimal(200.0));
		c1.setSales(10);
		c1.setTotal(5);
		c1.setSupplier(sp);

		Coffee c2 = new Coffee();
		c2.setCofName("Flavor B");
		c2.setPrice(new BigDecimal(100.0));
		c2.setSales(11);
		c2.setTotal(6);
		c2.setSupplier(sp);

		ArrayList<Coffee> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		sp.setCoffees(list);
		em.persist(sp);

		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAOneMany");
		EntityManager em = emf.createEntityManager();

		//em.getTransaction().begin();// 通常用在資料異動，只有新增修改刪除時才需要
		Query query = em.createQuery("select c from Coffee c");
		List<Coffee> list=query.getResultList();
		System.out.println("Coffee:");
		for (Coffee coffee : list) {
			System.out.println(coffee);
			System.out.println(coffee.getSupplier());
		}
		//em.getTransaction().commit();
		em.close();
		emf.close();
		request.setAttribute("coffee", list);
		request.getRequestDispatcher("viewCoffee.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// add();
		query(request,response);
		response.getWriter().append("1 Supplier 2 Coffee Added");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
