package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzxw extends com.google.android.gms.internal.ads.zzch {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final android.util.SparseArray zzh;
    private final android.util.SparseBooleanArray zzi;

    @java.lang.Deprecated
    public zzxw() {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.zzh = r0
            android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
            r0.<init>()
            r1.zzi = r0
            r1.zzx()
            return
    }

    public zzxw(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            super.zze(r3)
            android.graphics.Point r3 = com.google.android.gms.internal.ads.zzeu.zzv(r3)
            int r0 = r3.x
            int r3 = r3.y
            r1 = 1
            super.zzf(r0, r3, r1)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.zzh = r3
            android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray
            r3.<init>()
            r2.zzi = r3
            r2.zzx()
            return
    }

    /* synthetic */ zzxw(com.google.android.gms.internal.ads.zzxy r6, com.google.android.gms.internal.ads.zzxv r7) {
            r5 = this;
            r5.<init>(r6)
            boolean r7 = r6.zzC
            r5.zza = r7
            boolean r7 = r6.zzE
            r5.zzb = r7
            boolean r7 = r6.zzG
            r5.zzc = r7
            boolean r7 = r6.zzL
            r5.zzd = r7
            boolean r7 = r6.zzM
            r5.zze = r7
            boolean r7 = r6.zzN
            r5.zzf = r7
            boolean r7 = r6.zzP
            r5.zzg = r7
            android.util.SparseArray r7 = com.google.android.gms.internal.ads.zzxy.zza(r6)
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = 0
        L29:
            int r2 = r7.size()
            if (r1 >= r2) goto L44
            int r2 = r7.keyAt(r1)
            java.util.HashMap r3 = new java.util.HashMap
            java.lang.Object r4 = r7.valueAt(r1)
            java.util.Map r4 = (java.util.Map) r4
            r3.<init>(r4)
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto L29
        L44:
            r5.zzh = r0
            android.util.SparseBooleanArray r6 = com.google.android.gms.internal.ads.zzxy.zzb(r6)
            android.util.SparseBooleanArray r6 = r6.clone()
            r5.zzi = r6
            return
    }

    static /* bridge */ /* synthetic */ android.util.SparseArray zzn(com.google.android.gms.internal.ads.zzxw r0) {
            android.util.SparseArray r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ android.util.SparseBooleanArray zzo(com.google.android.gms.internal.ads.zzxw r0) {
            android.util.SparseBooleanArray r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzq(com.google.android.gms.internal.ads.zzxw r0) {
            boolean r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzr(com.google.android.gms.internal.ads.zzxw r0) {
            boolean r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzs(com.google.android.gms.internal.ads.zzxw r0) {
            boolean r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzt(com.google.android.gms.internal.ads.zzxw r0) {
            boolean r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzu(com.google.android.gms.internal.ads.zzxw r0) {
            boolean r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzv(com.google.android.gms.internal.ads.zzxw r0) {
            boolean r0 = r0.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzw(com.google.android.gms.internal.ads.zzxw r0) {
            boolean r0 = r0.zza
            return r0
    }

    private final void zzx() {
            r1 = this;
            r0 = 1
            r1.zza = r0
            r1.zzb = r0
            r1.zzc = r0
            r1.zzd = r0
            r1.zze = r0
            r1.zzf = r0
            r1.zzg = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzxw zzp(int r2, boolean r3) {
            r1 = this;
            android.util.SparseBooleanArray r0 = r1.zzi
            boolean r0 = r0.get(r2)
            if (r0 != r3) goto L9
            goto L17
        L9:
            if (r3 == 0) goto L12
            android.util.SparseBooleanArray r3 = r1.zzi
            r0 = 1
            r3.put(r2, r0)
            goto L17
        L12:
            android.util.SparseBooleanArray r3 = r1.zzi
            r3.delete(r2)
        L17:
            return r1
    }
}
