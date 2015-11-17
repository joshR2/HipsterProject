package hipstercontroller.controller;

import hipstercontroller.controller.HipsterController;

public class HipsterRunner
{
	/**
	 * Starts the Simple GUI Program
	 * @author jrob2049
	 *
	 */
	public class simpleAppRunner
	{
		public void main(String [] args)
		{
			HipsterController myHipsterController= new HipsterController();
			myHipsterController.start();
		}
		
	}
}
