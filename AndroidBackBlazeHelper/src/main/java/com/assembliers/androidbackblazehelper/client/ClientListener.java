/*
 * Copyright (c) 2021 . All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Last modified:  3/18/21 2:16 PM
 * Contact: Email : obaidaalmostarihi@gmail.com
 * Package: BackBlaze_Helper.AndroidBackBlazeHelper / BackBlaze Helper
 *
 */

package com.assembliers.androidbackblazehelper.client;

import org.json.JSONObject;

public interface ClientListener {

       void onConnectionStarted();

       void onRetrievingData(ClientModel data, JSONObject response);

       void onFailure(Exception e);


}

