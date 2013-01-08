package com.example.reflexgames;

public class timer {
	    
	    private long startTime;
	    private long stopTime;
	    private long elapsed;
	    private boolean running;

	    public timer(){
	    	
	    	startTime = 0;
	    	stopTime = 0;
	    	elapsed = 0;
	    	running = false;
	    	
	    }
	    
	    
	    public void start() {
	        this.startTime = System.nanoTime();
	        this.running = true;
	    }

	    
	    public void stop() {
	        this.stopTime = System.nanoTime();
	        this.running = false;
	    }

	    public void reset() {
	        this.startTime = 0;
	        this.stopTime = 0;
	        this.running = false;
	    }    
	    
	    
	    //elaspsed time in milliseconds
	    public long getElapsedTimeMilli() {
	        if (running) {
	            elapsed = ((System.nanoTime() - startTime) / 1000000);
	        }
	        else {
	            elapsed = ((stopTime - startTime) / 1000000);
	        }
	        return elapsed;
	    }
}