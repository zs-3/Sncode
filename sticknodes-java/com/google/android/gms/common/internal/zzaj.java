package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
public final class zzaj extends java.lang.Exception {
    public final com.google.android.gms.common.ConnectionResult zza;

    public zzaj(com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            r2.<init>()
            boolean r0 = r3.hasResolution()
            java.lang.String r1 = "ResolvableConnectionException can only be created with a connection result containing a resolution."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            r2.zza = r3
            return
    }
}
