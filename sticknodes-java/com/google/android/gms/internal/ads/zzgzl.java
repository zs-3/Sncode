package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgzl implements com.google.android.gms.internal.ads.zzgzn {
    zzgzl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
            r1 = this;
            byte r0 = r1.zza()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
