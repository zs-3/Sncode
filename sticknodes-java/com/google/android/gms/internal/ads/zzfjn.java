package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfjn implements java.lang.Cloneable {
    public boolean zza;
    public int zzb;

    public zzfjn() {
            r0 = this;
            r0.<init>()
            return
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.google.android.gms.internal.ads.zzfjn r0 = r1.zza()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfjn zza() {
            r1 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            com.google.android.gms.internal.ads.zzfjn r0 = (com.google.android.gms.internal.ads.zzfjn) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }
}
