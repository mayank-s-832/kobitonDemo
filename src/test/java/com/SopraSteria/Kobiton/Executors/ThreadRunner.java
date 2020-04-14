//package com.SopraSteria.Kobiton.Executors;
//
//import com.SopraSteria.helpers.JSONFunctions;
//
///**
// * Class containing Thread Functionalities.
// * @author  Samridhi Srivastava
// * @version 1.0
// * @since   December 2019
// */
//public class ThreadRunner {
//
//	
//	/**
//	 * Thread creation and initialization.
//	 */
//	public void startThread()
//	{
//		JSONFunctions jsonFunc	=	new JSONFunctions();
//		
//		int threads=jsonFunc.getNumberOfThreads();
//		
//		for (int currentThread = 0; currentThread < threads; currentThread++) {
//			ImplementsRunnable target = new ImplementsRunnable();
//			Thread thread = new Thread(target, String.valueOf(currentThread + 1));
//			System.out.println("Starting Thread :"+currentThread+1);
//			System.out.println("executionOn :"+jsonFunc.getValueOfLabel("executionOn", 1));
//			thread.start();
//		}
//		
//	}
//}
//
///**
// * Class Implementing Runnable Thread Class.
// * @author  Samridhi Srivastava
// * @version 1.0
// * @since   December 2019
// */
//class ImplementsRunnable implements Runnable {
//	
//	/**
//	 * Function to initialize thread and run it.
//	 */
//	public void run() {
//		try {
//			Controller controller=new Controller();
//			System.out.println("Thread Name: " + Thread.currentThread().getName());
//			controller.startExecution();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//}
