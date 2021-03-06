package com.connect;

import java.util.List;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;



@N1qlPrimaryIndexed
public interface VehicleRepository extends CouchbaseRepository<Vehicle,String> {
	
	Vehicle findByColor(String color);
	List<Vehicle> findAll();
	

}
