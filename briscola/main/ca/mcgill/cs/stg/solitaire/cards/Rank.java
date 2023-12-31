/*******************************************************************************
 * Solitaire
 *
 * Copyright (C) 2016-2018 by Martin P. Robillard
 *
 * See: https://github.com/prmr/Solitaire
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
 *******************************************************************************/
package ca.mcgill.cs.stg.solitaire.cards;

/**
 * Represents the rank of a playing card.
 */
public enum Rank {

	DUE    (0),
	QUATTRO(0),
	CINQUE (0),
	SEI    (0),
	SETTE  (0),
	FANTE  (2),
	CAVALLO(3),
	RE     (4),
	TRE    (10),
	ASSO   (11);

	private final int points;

	Rank(int points) {
		this.points = points;
	}

	public int points() {
		return points;
	}
}