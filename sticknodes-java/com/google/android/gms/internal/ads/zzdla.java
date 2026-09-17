package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdla {
    public static final com.google.android.gms.internal.ads.zzdla zza = null;
    private final com.google.android.gms.internal.ads.zzbhd zzb;
    private final com.google.android.gms.internal.ads.zzbha zzc;
    private final com.google.android.gms.internal.ads.zzbhq zzd;
    private final com.google.android.gms.internal.ads.zzbhn zze;
    private final com.google.android.gms.internal.ads.zzbmp zzf;
    private final androidx.collection.SimpleArrayMap zzg;
    private final androidx.collection.SimpleArrayMap zzh;

    static {
            com.google.android.gms.internal.ads.zzdky r0 = new com.google.android.gms.internal.ads.zzdky
            r0.<init>()
            com.google.android.gms.internal.ads.zzdla r1 = new com.google.android.gms.internal.ads.zzdla
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzdla.zza = r1
            return
    }

    private zzdla(com.google.android.gms.internal.ads.zzdky r3) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzbhd r0 = r3.zza
            r2.zzb = r0
            com.google.android.gms.internal.ads.zzbha r0 = r3.zzb
            r2.zzc = r0
            com.google.android.gms.internal.ads.zzbhq r0 = r3.zzc
            r2.zzd = r0
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            androidx.collection.SimpleArrayMap r1 = r3.zzf
            r0.<init>(r1)
            r2.zzg = r0
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            androidx.collection.SimpleArrayMap r1 = r3.zzg
            r0.<init>(r1)
            r2.zzh = r0
            com.google.android.gms.internal.ads.zzbhn r0 = r3.zzd
            r2.zze = r0
            com.google.android.gms.internal.ads.zzbmp r3 = r3.zze
            r2.zzf = r3
            return
    }

    /* synthetic */ zzdla(com.google.android.gms.internal.ads.zzdky r1, com.google.android.gms.internal.ads.zzdkz r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public final com.google.android.gms.internal.ads.zzbha zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbha r0 = r1.zzc
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbhd zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbhd r0 = r1.zzb
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbhg zzc(java.lang.String r2) {
            r1 = this;
            androidx.collection.SimpleArrayMap r0 = r1.zzh
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.ads.zzbhg r2 = (com.google.android.gms.internal.ads.zzbhg) r2
            return r2
    }

    public final com.google.android.gms.internal.ads.zzbhj zzd(java.lang.String r2) {
            r1 = this;
            androidx.collection.SimpleArrayMap r0 = r1.zzg
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.ads.zzbhj r2 = (com.google.android.gms.internal.ads.zzbhj) r2
            return r2
    }

    public final com.google.android.gms.internal.ads.zzbhn zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbhn r0 = r1.zze
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbhq zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbhq r0 = r1.zzd
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbmp zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbmp r0 = r1.zzf
            return r0
    }

    public final java.util.ArrayList zzh() {
            r3 = this;
            androidx.collection.SimpleArrayMap r0 = r3.zzg
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0.size()
            r1.<init>(r0)
            r0 = 0
        Lc:
            androidx.collection.SimpleArrayMap r2 = r3.zzg
            int r2 = r2.size()
            if (r0 >= r2) goto L22
            androidx.collection.SimpleArrayMap r2 = r3.zzg
            java.lang.Object r2 = r2.keyAt(r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            int r0 = r0 + 1
            goto Lc
        L22:
            return r1
    }

    public final java.util.ArrayList zzi() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.ads.zzbhq r1 = r2.zzd
            if (r1 == 0) goto L11
            r1 = 6
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.add(r1)
        L11:
            com.google.android.gms.internal.ads.zzbhd r1 = r2.zzb
            if (r1 == 0) goto L1d
            r1 = 1
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.add(r1)
        L1d:
            com.google.android.gms.internal.ads.zzbha r1 = r2.zzc
            if (r1 == 0) goto L29
            r1 = 2
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.add(r1)
        L29:
            androidx.collection.SimpleArrayMap r1 = r2.zzg
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L39
            r1 = 3
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.add(r1)
        L39:
            com.google.android.gms.internal.ads.zzbmp r1 = r2.zzf
            if (r1 == 0) goto L45
            r1 = 7
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.add(r1)
        L45:
            return r0
    }
}
