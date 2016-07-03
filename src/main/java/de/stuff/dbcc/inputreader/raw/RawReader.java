/*
 * Copyright (C) 2016 Sascha Kretzschmann (ksascha@posteo.de)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.stuff.dbcc.inputreader.raw;

import de.stuff.dbcc.inputreader.InputReader;

public class RawReader extends InputReader {

	StringBuilder buffer;

	public RawReader() {
		super();
		this.buffer = new StringBuilder(512);
		System.out.println("Created raw reader successfully.");
	}

	@Override
	public void readInput() {
		this.buffer.append("MECARD:");
		this.buffer.append("N:").append("Wayne, Bruce").append(";");
		this.buffer.append("ORG:").append("Wayne Enterprise").append(";");
		this.buffer.append("TEL:").append("1234567").append(";");
		// this.buffer.append("URL:").append("").append(";");
		// this.buffer.append("EMAIL:").append("email").append(";");
		this.buffer.append("ADR:").append("Second Street 1, Gotham City, U.S.").append(";");
		this.buffer.append("NOTE:").append("Batman").append(";");
	}

	@Override
	public String getInput() {
		if (this.buffer != null) {
			return this.buffer.toString();
		} else {
			System.err.println("Error! No input read.");
			return null;
		}
	}

}
