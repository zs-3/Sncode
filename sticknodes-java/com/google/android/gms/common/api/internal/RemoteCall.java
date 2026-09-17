package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public interface RemoteCall<T, U> {
    @com.google.android.gms.common.annotation.KeepForSdk
    void accept(T r1, U r2) throws android.os.RemoteException;
}
