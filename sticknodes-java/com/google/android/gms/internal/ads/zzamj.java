package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzamj implements java.lang.Comparable {
    public final int zza;
    public final com.google.android.gms.internal.ads.zzamd zzb;

    public zzamj(int r1, com.google.android.gms.internal.ads.zzamd r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzamj r2 = (com.google.android.gms.internal.ads.zzamj) r2
            int r2 = r2.zza
            int r0 = r1.zza
            int r2 = java.lang.Integer.compare(r0, r2)
            return r2
    }
}
