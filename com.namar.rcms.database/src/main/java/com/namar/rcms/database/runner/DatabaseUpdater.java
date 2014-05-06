package com.namar.rcms.database.runner;

import java.net.UnknownHostException;

import org.mongeez.Mongeez;
import org.springframework.core.io.ClassPathResource;

import com.mongodb.Mongo;
import com.mongodb.MongoException;

/**
 * 
 * 
 * @author deleter
 *
 */
public class DatabaseUpdater {

	public static void main(String[] args) throws UnknownHostException, MongoException {
		Mongeez  mongeez = new Mongeez();
		mongeez.setFile(new ClassPathResource("/scripts/changeLog.xml"));
		mongeez.setMongo(new Mongo("localhost"));
		mongeez.setDbName("rCms");
		mongeez.process();
	}

}
