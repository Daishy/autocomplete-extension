package org.vaadin.addons.autocomplete.client;

import com.vaadin.shared.communication.ServerRpc;

public interface AutocompleteExtensionServerRpc extends ServerRpc {

    public void getSuggestion(String query);

    public void suggestionSelected(String value);
}