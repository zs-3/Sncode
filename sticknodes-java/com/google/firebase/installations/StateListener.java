package com.google.firebase.installations;

/* loaded from: classes2.dex */
interface StateListener {
    boolean onException(java.lang.Exception r1);

    boolean onStateReached(com.google.firebase.installations.local.PersistedInstallationEntry r1);
}
