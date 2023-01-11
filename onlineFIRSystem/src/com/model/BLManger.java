package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pojo.Criminaldetail;
import com.pojo.Firrecord;
import com.pojo.Missingrecord;
import com.pojo.Registration;
import com.pojo.Role;
import com.pojo.Status;
import com.pojo.Theftrecord;

public class BLManger {
	
	SessionFactory com=new Configuration().configure().buildSessionFactory();
	
	//*****************Registration Servlate**************//

	public Role searchbyname(String rname) {
		Session s1=com.openSession();
		Criteria cr=s1.createCriteria(Role.class);
		cr.add(Restrictions.eq("rname", rname));
		Role r=(Role)cr.uniqueResult();
		s1.close();
		return r;
	}

	public void saveregister(Registration rg) 
	{
		Session s1=com.openSession();
		Transaction t1=s1.beginTransaction();
		s1.save(rg);
		t1.commit();
		s1.close();
		
	}
	
	//*******************Login Servlate*********************//

	public Registration serchbyemaillogin(String email) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Registration.class);
		cr.add(Restrictions.eq("email", email));
		Registration d = (Registration) cr.uniqueResult();
		
		return d;
	}

	public boolean searchbyCandEmailAndPassword(String email, String password) {
		Registration r = serachbyemailpass(email, password);

		if (r != null && r.getEmail().equals(email) && r.getPassword().equals(password)) {
			return true;

		} else {
			return false;
		}
	}

	private Registration serachbyemailpass(String email, String password) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Registration.class);
		cr.add(Restrictions.eq("email", email));
		Registration d = (Registration) cr.uniqueResult();
		s.close();
		return d;
	}
	//*************UserProfileUpdate Servlate************//

	public Registration serchbyemailuser(String emaill) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Registration.class);
		cr.add(Restrictions.eq("email", emaill));
		Registration d = (Registration) cr.uniqueResult();
		s.close();
		return d;
	}

	public void updateuserpro(Registration r) {
		Session s=com.openSession();
		Transaction t1=s.beginTransaction();
		s.update(r);
		t1.commit();
		s.close();
		
	}
	
	//*************Missing Servlate***********//

	public Registration serchbyemailmissing(String email) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Registration.class);
		cr.add(Restrictions.eq("email", email));
		Registration d = (Registration) cr.uniqueResult();
		s.close();
		return d;
	}

	public void savemissing(Missingrecord m) {
		Session s1 = com.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(m);
		t1.commit();
		s1.close();
		
	}
	
	//****************Theft Servlate*************//

	public Registration serchbyemailtheft(String email) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Registration.class);
		cr.add(Restrictions.eq("email", email));
		Registration d = (Registration) cr.uniqueResult();
		s.close();
		return d;
	}

	public void savetheft(Theftrecord t) {
		Session s1 = com.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(t);
		t1.commit();
		s1.close();
		
	}
	
	//***********FIR_Record Servlate*************//

	public Registration serchbyemailfir(String email) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Registration.class);
		cr.add(Restrictions.eq("email", email));
		Registration d = (Registration) cr.uniqueResult();
		s.close();
		return d;
	}

	public void savefir(Firrecord f) {
		Session s1 = com.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(f);
		t1.commit();
		s1.close();
		
	}
	
	
	
	//*****************Missing_Search jsp************************//
	
	public List<Missingrecord> missingsearchlist()
	{
		Session s1=com.openSession();
    	Criteria cr=s1.createCriteria(Missingrecord.class);
    	List<Missingrecord> l=cr.list();
    	return l;
    	
		
	}
	
	//*****************Theft Search jsp**********************//
	
	public List<Theftrecord> theftsearchlist()
	{
		Session s1=com.openSession();
    	Criteria cr=s1.createCriteria(Theftrecord.class);
    	List<Theftrecord> l=cr.list();
    	
    	return l;
		
	}
	
	//*****************FIR Search jsp**********************//
	
	public List<Firrecord> firsearchlist()
	{
		Session s1=com.openSession();
    	Criteria cr=s1.createCriteria(Firrecord.class);
    	List<Firrecord> l=cr.list();
	
    	return l;
		
	}
	
	//******************Missing Record Search Update Servlate*************//

	public Missingrecord serchbyidmissing(int missingNo1)
	{
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Missingrecord.class);
		cr.add(Restrictions.eq("missingNo", missingNo1));
		Missingrecord d = (Missingrecord) cr.uniqueResult();
		s.close();
		return d;
	}

	public void updatemissing(Missingrecord m) {
		Session s=com.openSession();
		Transaction t1=s.beginTransaction();
		s.update(m);
		t1.commit();
		s.close();
		
	}
	
	//****************Missing Record Delete Servlate*********************//

	public Missingrecord serachidmissingdelete(int missingNo1) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Missingrecord.class);
		cr.add(Restrictions.eq("missingNo", missingNo1));
		Missingrecord d = (Missingrecord) cr.uniqueResult();
		s.close();
		return d;
	}

	public void deletemissing(Missingrecord m) {
		Session s=com.openSession();
		Transaction t1=s.beginTransaction();
		s.delete(m);
		t1.commit();
		s.close();
		
	}
	
	//******************Theft Record Search Update Servlate*************//

	public Theftrecord serchbyidtheft(int theftNo1) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Theftrecord.class);
		cr.add(Restrictions.eq("theftNo", theftNo1));
		Theftrecord d = (Theftrecord) cr.uniqueResult();
		s.close();
		return d;
	}

	public void updatetheft(Theftrecord t) {
		Session s=com.openSession();
		Transaction t1=s.beginTransaction();
		s.update(t);
		t1.commit();
		s.close();
		
	}
	
	//****************Theft Record Delete Servlate*********************//

	public Theftrecord serachidtheftdelete(int theftNo1) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Theftrecord.class);
		cr.add(Restrictions.eq("theftNo", theftNo1));
		Theftrecord d = (Theftrecord) cr.uniqueResult();
		s.close();
		return d;
	}

	public void deletemissing(Theftrecord t) {
		Session s=com.openSession();
		Transaction t1=s.beginTransaction();
		s.delete(t);
		t1.commit();
		s.close();
		
	}
	
	//******************FIR Record Search Update Servlate*************//

	public Firrecord serchbyidfir(int firNo1) 
	{
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Firrecord.class);
		cr.add(Restrictions.eq("firNo", firNo1));
		Firrecord d = (Firrecord) cr.uniqueResult();
		s.close();
		return d;
	}

	public void updatefir(Firrecord f) {
		Session s=com.openSession();
		Transaction t1=s.beginTransaction();
		s.update(f);
		t1.commit();
		s.close();
		
	}
	
	//****************FIR Record Delete Servlate*********************//

	public Firrecord serachidfirdelete(int firNo1) 
	{
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Firrecord.class);
		cr.add(Restrictions.eq("firNo", firNo1));
		Firrecord d = (Firrecord) cr.uniqueResult();
		s.close();
		return d;
	}

	public void deletefir(Firrecord f) 
	{
		Session s=com.openSession();
		Transaction t1=s.beginTransaction();
		s.delete(f);
		t1.commit();
		s.close();
		
	}
	
	//****************Change Password Servlate*********************//

	public Registration serchbyemailpasschang(String email) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Registration.class);
		cr.add(Restrictions.eq("email", email));
		Registration d = (Registration) cr.uniqueResult();
		s.close();
		return d;
		
	}

	public void updateemail(Registration r) 
	{
		
		Session s=com.openSession();
		Transaction t1=s.beginTransaction();
		s.update(r);
		t1.commit();
		s.close();
	}
	
	//**************Forget Password Servlate******************//

	public Registration serchbyemailforgetpassword(String email) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Registration.class);
		cr.add(Restrictions.eq("email", email));
		Registration d = (Registration) cr.uniqueResult();
		s.close();
		return d;
	}

	public void savecriminalrecord(Criminaldetail c) {
		Session s=com.openSession();
		Transaction t=s.beginTransaction();
		s.save(c);
		t.commit();
		s.close();
		
	}
	
	
	//*****************Search Criminal Detail jsp***********************************//
	
	
	public List<Criminaldetail> criminalsearchlist()
	{
		Session s1=com.openSession();
    	Criteria cr=s1.createCriteria(Criminaldetail.class);
    	List<Criminaldetail> l=cr.list();
    	
    	return l;
		
	}
	
	//*******************View Criminal Detail jsp*********************//
	
	public List<Criminaldetail> viewcriminallist()
	{
		Session s1=com.openSession();
    	Criteria cr=s1.createCriteria(Criminaldetail.class);
    	List<Criminaldetail> l=cr.list();
    	
    	return l;
		
	}
	
	//********************Criminal Record Update Servlate****************//

	public Criminaldetail searcgcriminalno(int criminalNo1)
	{
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Criminaldetail.class);
		cr.add(Restrictions.eq("criminalNo", criminalNo1));
		Criminaldetail d = (Criminaldetail) cr.uniqueResult();
		s.close();
		return d;
	}

	public void ciminalrecordupdate(Criminaldetail c) 
	{
        Session s=com.openSession();
        Transaction t=s.beginTransaction();
        s.update(c);
        t.commit();
        s.close();
		
	}
	
	//*************************Criminal Record Delete Servlate**************//

	public Criminaldetail searchcriminalrecordno(int criminalNo1) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Criminaldetail.class);
		cr.add(Restrictions.eq("criminalNo", criminalNo1));
		Criminaldetail d = (Criminaldetail) cr.uniqueResult();
		s.close();
		return d;
	}

	public void deletecriminalrecord(Criminaldetail c) 
	{
		Session s=com.openSession();
		Transaction t=s.beginTransaction();
		s.delete(c);
		t.commit();
		s.close();
		
	}
	
	//**********************Search Missing For Police jsp*****************//
	
	public List<Missingrecord> missingsearchlistforpolice()
	{
		Session s1=com.openSession();
    	Criteria cr=s1.createCriteria(Missingrecord.class);
    	List<Missingrecord> l=cr.list();
    	return l;
    	
		
	}
	
	//*********************Search Theft For Police jsp*******************//
	
	public List<Theftrecord> theftsearchlistforpolice()
	{
		Session s1=com.openSession();
    	Criteria cr=s1.createCriteria(Theftrecord.class);
    	List<Theftrecord> l=cr.list();
    	
    	return l;
		
	}
	
	//******************Search FIR For Police jsp*****************//
	
	public List<Firrecord> firsearchlistforpiloce()
	{
		Session s1=com.openSession();
    	Criteria cr=s1.createCriteria(Firrecord.class);
    	List<Firrecord> l=cr.list();
	
    	return l;
		
	}
	
	//*********************Missing Complain Status Servlate***************//

	public Missingrecord searchmissingidstatus(int missingNo1) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Missingrecord.class);
		cr.add(Restrictions.eq("missingNo", missingNo1));
		Missingrecord d = (Missingrecord) cr.uniqueResult();
		s.close();
		return d;
	}

	public void savemissingstatus(Status s) 
	{
		Session s1=com.openSession();
		Transaction t1=s1.beginTransaction();
		s1.save(s);
		t1.commit();
		s1.close();
		
	}
	
	//*****************Theft Complain Status Servlate****************//

	public Theftrecord searchtheftidstatus(int theftNo1) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Theftrecord.class);
		cr.add(Restrictions.eq("theftNo", theftNo1));
		Theftrecord d = (Theftrecord) cr.uniqueResult();
		s.close();
		return d;
	}

	public void savetheftstatus(Status s) 
	{
		Session s1=com.openSession();
		Transaction t1=s1.beginTransaction();
		s1.save(s);
		t1.commit();
		s1.close();
		
	}

	
	
	//******************FIR Complain Status Servlate******************//
	
	public Firrecord searchfiridstatus(int firNo1) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Firrecord.class);
		cr.add(Restrictions.eq("firNo", firNo1));
		Firrecord d = (Firrecord) cr.uniqueResult();
		s.close();
		return d;
	}

	public void savefirstatus(Status s) 
	{
		Session s1=com.openSession();
		Transaction t1=s1.beginTransaction();
		s1.save(s);
		t1.commit();
		s1.close();
		
		
	}
	
	//************************View Missing Complain Status jsp***************//
	
	public List<Status> viewmissingsatuslist()
	{
		Session s1=com.openSession();
    	Criteria cr=s1.createCriteria(Status.class);
    	List<Status> l=cr.list();
    	
    	return l;
		
	}
	
	//************************Delete Missing Complain Status*****************//

	public Status searchmissingstatus(int statusNo1) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Status.class);
		cr.add(Restrictions.eq("statusNo", statusNo1));
		Status d = (Status) cr.uniqueResult();
		s.close();
		return d;
	}
	

	public void deletemissingstatus(Status s) 
	{
		Session s1=com.openSession();
		Transaction t1=s1.beginTransaction();
		s1.delete(s);
		t1.commit();
		s1.close();
		
	}
	
	//***********View Theft  Complain Status jsp************************//
	
	public List<Status> viewtheftsatuslist()
	{
		Session s1=com.openSession();
    	Criteria cr=s1.createCriteria(Status.class);
    	List<Status> l=cr.list();
    	
    	return l;
		
	}

	
	//*************Delete Theft Complain Status********************//
	
	
	
	public Status searchtheftstatus(int statusNo1) {
		Session s = com.openSession();
		Criteria cr = s.createCriteria(Status.class);
		cr.add(Restrictions.eq("statusNo", statusNo1));
		Status d = (Status) cr.uniqueResult();
		s.close();
		return d;
	}

	public void deletetheftstatus(Status s) 
	{
		Session s1=com.openSession();
		Transaction t1=s1.beginTransaction();
		s1.delete(s);
		t1.commit();
		s1.close();
		
	}
	
	//***********View FIR  Complain Status jsp************************//
	
		public List<Status> viewfirsatuslist()
		{
			Session s1=com.openSession();
	    	Criteria cr=s1.createCriteria(Status.class);
	    	List<Status> l=cr.list();
	    	
	    	return l;
			
		}
		
		//*********Delete FIR Complain Status*****************//

		public Status searchfirstatus(int statusNo1) {
			Session s = com.openSession();
			Criteria cr = s.createCriteria(Status.class);
			cr.add(Restrictions.eq("statusNo", statusNo1));
			Status d = (Status) cr.uniqueResult();
			s.close();
			return d;
		}

		public void deletefirstatus(Status s) 
		{
			Session s1=com.openSession();
			Transaction t1=s1.beginTransaction();
			s1.delete(s);
			t1.commit();
			s1.close();
			
		}
		
		//************************View Missing Complain Status User jsp***************//
		
		public List<Status> viewusermissingsatuslist()
		{
			Session s1=com.openSession();
	    	Criteria cr=s1.createCriteria(Status.class);
	    	List<Status> l=cr.list();
	    	
	    	return l;
			
		}
		
		//************* Missing Complain Status User Servlate**********************//

		public Missingrecord searchmissingidstatususer(int missingNo1) 
		{
			Session s = com.openSession();
			Criteria cr = s.createCriteria(Missingrecord.class);
			cr.add(Restrictions.eq("missingNo", missingNo1));
			Missingrecord d = (Missingrecord) cr.uniqueResult();
			s.close();
			return d;
		}

		public void savemissingstatususer(Status s) 
		{
			Session s1=com.openSession();
			Transaction t1=s1.beginTransaction();
			s1.save(s);
			t1.commit();
			s1.close();
			
		}
		
		//***************Delete Missing Complain Status User*****************//

		public Status searchmissingstatususer(int statusNo1) {
			Session s = com.openSession();
			Criteria cr = s.createCriteria(Status.class);
			cr.add(Restrictions.eq("statusNo", statusNo1));
			Status d = (Status) cr.uniqueResult();
			s.close();
			return d;
		}

		public void deletemissingstatususer(Status s) 
		{
			Session s1=com.openSession();
			Transaction t1=s1.beginTransaction();
			s1.delete(s);
			t1.commit();
			s1.close();
			
		}
		
		//***********View Theft  Complain Status User jsp************************//
		
		public List<Status> viewtheftsatususerlist()
		{
			Session s1=com.openSession();
	    	Criteria cr=s1.createCriteria(Status.class);
	    	List<Status> l=cr.list();
	    	
	    	return l;
			
		}
		
		//***************Theft Complain Status User Servlate****************//

		public Theftrecord searchtheftidstatususer(int theftNo1) {
			Session s = com.openSession();
			Criteria cr = s.createCriteria(Theftrecord.class);
			cr.add(Restrictions.eq("theftNo", theftNo1));
			Theftrecord d = (Theftrecord) cr.uniqueResult();
			s.close();
			return d;
		}

		public void savetheftstatususer(Status s) {
			Session s1=com.openSession();
			Transaction t1=s1.beginTransaction();
			s1.save(s);
			t1.commit();
			s1.close();
			
		}
		
		//******************Delete Theft Complain Status User Servlate*******************//

		public Status searchtheftstatususer(int statusNo1) {
			Session s = com.openSession();
			Criteria cr = s.createCriteria(Status.class);
			cr.add(Restrictions.eq("statusNo", statusNo1));
			Status d = (Status) cr.uniqueResult();
			s.close();
			return d;
		}

		public void deletetheftstatususer(Status s)
		{
			Session s1=com.openSession();
			Transaction t1=s1.beginTransaction();
			s1.delete(s);
			t1.commit();
			s1.close();
			
			
		}

		//**************View FIR Complain Status User jsp****************//
		
		
		public List<Status> viewfirsatususerlist()
		{
			Session s1=com.openSession();
	    	Criteria cr=s1.createCriteria(Status.class);
	    	List<Status> l=cr.list();
	    	
	    	return l;
			
		}
		
		//**************Fir Complain Status User Servlate************//

		public Firrecord searchfiridstatususer(int firNo1) {
			Session s = com.openSession();
			Criteria cr = s.createCriteria(Firrecord.class);
			cr.add(Restrictions.eq("firNo", firNo1));
			Firrecord d = (Firrecord) cr.uniqueResult();
			s.close();
			return d;
		}

		public void savefirstatususer(Status s) 
		{
			Session s1=com.openSession();
			Transaction t1=s1.beginTransaction();
			s1.save(s);
			t1.commit();
			s1.close();
			
			
		}
		//***********Delete FIR Complain User Servlate****************//

		public Status searchfirstatususer(int statusNo1) {
			Session s = com.openSession();
			Criteria cr = s.createCriteria(Status.class);
			cr.add(Restrictions.eq("statusNo", statusNo1));
			Status d = (Status) cr.uniqueResult();
			s.close();
			return d;
		}

		public void deletefirstatususer(Status s) 
		{
			Session s1=com.openSession();
			Transaction t1=s1.beginTransaction();
			s1.delete(s);
			t1.commit();
			s1.close();
			
		}
		
		//****************Change Password Police sarvlate********************//

		public Registration serchbyemailpasschangpolice(String email) {
			Session s = com.openSession();
			Criteria cr = s.createCriteria(Registration.class);
			cr.add(Restrictions.eq("email", email));
			Registration d = (Registration) cr.uniqueResult();
			s.close();
			return d;
		}

		public void updateemailpolice(Registration r)
		{
			
			Session s=com.openSession();
			Transaction t1=s.beginTransaction();
			s.update(r);
			t1.commit();
			s.close();
		}
		
		//****************View Ragister Record jsp************************//
		public List<Registration> registrationsearchlist()
		{
			Session s1=com.openSession();
	    	Criteria cr=s1.createCriteria(Registration.class);
	    	List<Registration> l=cr.list();
	    	return l;
			
		}
		
		//**********************Ragister Record Update Servlate***************//

		public Registration serachidragister(int regNo1) {
			Session s1=com.openSession();
	    	Criteria cr=s1.createCriteria(Registration.class);
	    	cr.add(Restrictions.eq("regNo", regNo1));
	    	Registration e=(Registration)cr.uniqueResult();
	    	s1.close();
			return e;
		}
		
		//*******************Ragister Record Delete Servlate

		public void deleteragister(Registration r) 
		{
			Session s1=com.openSession();
			Transaction t1=s1.beginTransaction();
			s1.delete(r);
			t1.commit();
			s1.close();
			
		}
		
		//*************Missing Status Admin Update*************//

		public void missingstatusupdate(Status s) 
		{
			Session s1=com.openSession();
			Transaction t1=s1.beginTransaction();
			s1.update(s);
			t1.commit();
			s1.close();
			
			
		}

		
	

}
