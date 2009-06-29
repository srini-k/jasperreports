/*
 * ============================================================================
 * GNU Lesser General Public License
 * ============================================================================
 *
 * JasperReports - Free Java report-generating library.
 * Copyright (C) 2001-2009 JasperSoft Corporation http://www.jaspersoft.com
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
 * 
 * JasperSoft Corporation
 * 539 Bryant Street, Suite 100
 * San Francisco, CA 94107
 * http://www.jaspersoft.com
 */
package net.sf.jasperreports.charts.fill;

import net.sf.jasperreports.charts.JRItemLabel;
import net.sf.jasperreports.charts.JRPie3DPlot;
import net.sf.jasperreports.engine.fill.JRFillChartPlot;
import net.sf.jasperreports.engine.fill.JRFillObjectFactory;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id$
 */
public class JRFillPie3DPlot extends JRFillChartPlot implements JRPie3DPlot
{


	/**
	 *
	 */
	public JRFillPie3DPlot(
		JRPie3DPlot pie3DPlot, 
		JRFillObjectFactory factory
		)
	{
		super(pie3DPlot, factory);
		System.out.println("JRFillPie3DPlot: "+pie3DPlot.getItemLabel());
		System.out.println("JRFillPie3DPlot: "+getItemLabel());
	}
		

	/**
	 * @deprecated Replaced by {@link #getDepthFactorDouble()}
	 */
	public double getDepthFactor()
	{
		return ((JRPie3DPlot)parent).getDepthFactor();
	}
	
	/**
	 *
	 */
	public Double getDepthFactorDouble()
	{
		return ((JRPie3DPlot)parent).getDepthFactorDouble();
	}
	
	/**
	 * @deprecated Replaced by {@link #getCircular()}
	 */
	public boolean isCircular()
	{
		return ((JRPie3DPlot)parent).isCircular();
	}
	
	/**
	 *
	 */
	public Boolean getCircular()
	{
		return ((JRPie3DPlot)parent).getCircular();
	}
	
	/**
	 *
	 */
	public String getLabelFormat()
	{
		return ((JRPie3DPlot)parent).getLabelFormat();
	}
	
	/**
	 *
	 */
	public String getLegendLabelFormat()
	{
		return ((JRPie3DPlot)parent).getLegendLabelFormat();
	}
	
	/**
	 *
	 */
	public JRItemLabel getItemLabel()
	{
		return ((JRPie3DPlot)parent).getItemLabel();
	}
	
}
