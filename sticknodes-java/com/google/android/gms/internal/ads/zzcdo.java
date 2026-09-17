package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcdo implements java.lang.Iterable {
    private final java.util.List zza;

    public zzcdo() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zza = r0
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            java.util.List r0 = r1.zza
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    final com.google.android.gms.internal.ads.zzcdn zza(com.google.android.gms.internal.ads.zzccj r4) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L15
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzcdn r1 = (com.google.android.gms.internal.ads.zzcdn) r1
            com.google.android.gms.internal.ads.zzccj r2 = r1.zza
            if (r2 != r4) goto L4
            return r1
        L15:
            r4 = 0
            return r4
    }

    public final void zzb(com.google.android.gms.internal.ads.zzcdn r2) {
            r1 = this;
            java.util.List r0 = r1.zza
            r0.add(r2)
            return
    }

    public final void zzc(com.google.android.gms.internal.ads.zzcdn r2) {
            r1 = this;
            java.util.List r0 = r1.zza
            r0.remove(r2)
            return
    }

    public final boolean zzd(com.google.android.gms.internal.ads.zzccj r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r4.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzcdn r2 = (com.google.android.gms.internal.ads.zzcdn) r2
            com.google.android.gms.internal.ads.zzccj r3 = r2.zza
            if (r3 != r5) goto L9
            r0.add(r2)
            goto L9
        L1d:
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L25
            r5 = 0
            return r5
        L25:
            java.util.Iterator r5 = r0.iterator()
        L29:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r5.next()
            com.google.android.gms.internal.ads.zzcdn r0 = (com.google.android.gms.internal.ads.zzcdn) r0
            com.google.android.gms.internal.ads.zzcdv r0 = r0.zzb
            r0.zzf()
            goto L29
        L3b:
            r5 = 1
            return r5
    }
}
