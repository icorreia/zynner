package com.icorreia.commons.serialization;

import com.icorreia.commons.messaging.Message;

/**
 *
 * @author Ivo Correia (idvcorreia@gmail.com)
 * @since 0.1
 */
public class DummyMessage extends Message{
    /** Serial Version UID */
    private static final long serialVersionUID = 1L;

    public DummyMessage() {

    }

    public DummyMessage(Object contents) {
        super(contents);
    }
}
