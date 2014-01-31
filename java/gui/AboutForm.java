/* Copyright (C) 2014 CompleteDB LLC.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with PubSubSQL.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AboutForm extends JDialog {

	private AboutPanel panel;

	public AboutForm(JFrame owner) {
		super(owner, "About PubSubSQL Interactive Query", true);		

		panel = new AboutPanel();
		add(panel, BorderLayout.CENTER);
		pack();
		setResizable(false);
		
		panel.okButton.addActionListener( new ActionListener() {	
			public void actionPerformed(ActionEvent event) {
				setVisible(false);
			}
		});
	}
}

