package com.github.krane.gfx;

import java.awt.Graphics;
import java.util.function.IntPredicate;

import com.github.krane.entities.Player;

public class ExpBar {
	
	float xpPercent = 0.0f;
	int panelCoords[];
	int expbarCoords[];
	
	public ExpBar(AbilityPanel abilityPanel)
	{
		panelCoords = abilityPanel.panelCoords;
		//expbarCoords = {1,2};
		expbarCoords = expBarCoords();
	}
	
	
	//Array constants can only be used in initializers FUCK YOU
	public int[] expBarCoords()
	{
		int[] res = { panelCoords[0], panelCoords[1]+150, panelCoords[2], 10};
		return res;
	}
	
	public void draw(Graphics graphics, Player player)
	{
		graphics.drawRect(expbarCoords[0], expbarCoords[1], expbarCoords[2], expbarCoords[3]);
		graphics.drawString(String.format("XP: %.2f", xpPercent), expbarCoords[2]/2, (int) ((int)expbarCoords[1]/1-5));
		fillWithCurrentXP(player, graphics);
	}
	
	
	private void fillWithCurrentXP(Player player, Graphics graphics)
	{
		xpPercent = player.exp * 100 / player.requiredExp;
		
		int bar_XpValue_BasedOnPlayerXpPercentage = (int) (xpPercent / 100 * expbarCoords[2]);
				
		graphics.fillRect(expbarCoords[0], expbarCoords[1],  (int)bar_XpValue_BasedOnPlayerXpPercentage, expbarCoords[3]);
		
		//System.out.println("EXP: " + player.exp + " REQ: " + player.requiredExp + " XP%: " + bar_XpValue_BasedOnPlayerXpPercentage );
	}
	
}
