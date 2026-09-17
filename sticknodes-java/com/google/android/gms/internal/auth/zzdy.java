package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
abstract class zzdy implements com.google.android.gms.internal.auth.zzea {
    zzdy() {
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
