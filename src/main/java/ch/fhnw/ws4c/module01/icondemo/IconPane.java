/*
 *
 * Copyright (c) 2015 by FHNW
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package ch.fhnw.ws4c.module01.icondemo;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

/**
 * @author Dieter Holz
 */
public class IconPane extends StackPane {
	private static final String SAVE   = "\uf0c7";

	private Button button;

	public IconPane() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		button = new Button(SAVE);
		button.getStyleClass().add("icon");
	}

	private void layoutControls() {
		getChildren().add(button);
	}
}
