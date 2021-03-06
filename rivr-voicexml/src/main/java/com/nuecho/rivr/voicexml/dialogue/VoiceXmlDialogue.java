/*
 * Copyright (c) 2013 Nu Echo Inc. All rights reserved.
 */

package com.nuecho.rivr.voicexml.dialogue;

import com.nuecho.rivr.core.dialogue.*;
import com.nuecho.rivr.voicexml.rendering.voicexml.*;
import com.nuecho.rivr.voicexml.turn.first.*;
import com.nuecho.rivr.voicexml.turn.input.*;
import com.nuecho.rivr.voicexml.turn.last.*;
import com.nuecho.rivr.voicexml.turn.output.*;

/**
 * @author Nu Echo Inc.
 */
public interface VoiceXmlDialogue extends
        Dialogue<VoiceXmlInputTurn, VoiceXmlOutputTurn, VoiceXmlFirstTurn, VoiceXmlLastTurn, VoiceXmlDialogueContext> {}
