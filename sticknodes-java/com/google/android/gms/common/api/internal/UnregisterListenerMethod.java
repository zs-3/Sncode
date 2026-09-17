package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public abstract class UnregisterListenerMethod<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zaa;

    @com.google.android.gms.common.annotation.KeepForSdk
    protected UnregisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
            r1 = this;
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r1.zaa
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract void unregisterListener(A r1, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> r2) throws android.os.RemoteException;
}
