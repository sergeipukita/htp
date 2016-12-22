package by.htp.poster.logic.impl;

import by.htp.poster.domain.Affiche;
import by.htp.poster.domain.Event;
import by.htp.poster.logic.AfficheViewer;

public class ConsoleAfficheViewer implements AfficheViewer{
	
	public void loadAffiche(Affiche affiche){
		
		for(Event event:affiche.getEvents())
		{
			System.out.print(event);
		}
	};

}
