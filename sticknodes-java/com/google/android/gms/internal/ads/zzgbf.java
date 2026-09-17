package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
enum zzgbf extends java.lang.Enum implements java.util.Iterator {
    public static final com.google.android.gms.internal.ads.zzgbf zza = null;
    private static final /* synthetic */ com.google.android.gms.internal.ads.zzgbf[] zzb = null;

    static {
            com.google.android.gms.internal.ads.zzgbf r0 = new com.google.android.gms.internal.ads.zzgbf
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzgbf.zza = r0
            r1 = 1
            com.google.android.gms.internal.ads.zzgbf[] r1 = new com.google.android.gms.internal.ads.zzgbf[r1]
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzgbf.zzb = r1
            return
    }

    zzgbf(java.lang.String r1, int r2) {
            r0 = this;
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public static com.google.android.gms.internal.ads.zzgbf[] values() {
            com.google.android.gms.internal.ads.zzgbf[] r0 = com.google.android.gms.internal.ads.zzgbf.zzb
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.ads.zzgbf[] r0 = (com.google.android.gms.internal.ads.zzgbf[]) r0
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "no calls to next() since the last call to remove()"
            com.google.android.gms.internal.ads.zzfxz.zzk(r0, r1)
            return
    }
}
