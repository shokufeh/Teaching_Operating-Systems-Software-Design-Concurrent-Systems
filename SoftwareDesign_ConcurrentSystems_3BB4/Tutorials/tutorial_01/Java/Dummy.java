/*  Copyright (C) 2009 Valentin Cassano <cassanv@mcmaster.ca>

     This file is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.
 
     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.
 
     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA */

import java.lang.Thread;
import java.lang.Math;

class Dummy extends Thread
{
	private String msg = ""; /* the message to be printed */
	
	Dummy( )
	{
		this.msg = "";
		
	}
	
	Dummy( String msg )
	{
		this.msg = msg;
	}
	
	private int delay( )
	{
		/* an arbitary delay between 1 and 2 seconds */
		return ( int ) ( ( Math.random() + 1 ) * 1000 );
	}
	
	public void run()
	{
		while( true )
		{
			System.out.println( this.msg );
			
			/* the sleep method is invoked to cause an arbitary delay */
			try{
				sleep(  delay( ) );
			}catch( InterruptedException e ) {};
		}
	}
}
