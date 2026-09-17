package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeh {
    private final java.util.HashSet zza;
    private final android.os.Bundle zzb;
    private final java.util.HashMap zzc;
    private final java.util.HashSet zzd;
    private final android.os.Bundle zze;
    private final java.util.HashSet zzf;
    private java.lang.String zzg;
    private final java.util.List zzh;
    private java.lang.String zzi;
    private java.lang.String zzj;
    private int zzk;
    private boolean zzl;
    private java.lang.String zzm;
    private int zzn;

    public zzeh() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zza = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.zzb = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzc = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zzd = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.zze = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zzf = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzh = r0
            r0 = -1
            r1.zzk = r0
            r0 = 60000(0xea60, float:8.4078E-41)
            r1.zzn = r0
            return
    }

    static /* bridge */ /* synthetic */ boolean zzE(com.google.android.gms.ads.internal.client.zzeh r0) {
            boolean r0 = r0.zzl
            return r0
    }

    static /* bridge */ /* synthetic */ int zza(com.google.android.gms.ads.internal.client.zzeh r0) {
            int r0 = r0.zzn
            return r0
    }

    static /* bridge */ /* synthetic */ int zzb(com.google.android.gms.ads.internal.client.zzeh r0) {
            int r0 = r0.zzk
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.Bundle zzc(com.google.android.gms.ads.internal.client.zzeh r0) {
            android.os.Bundle r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.Bundle zzd(com.google.android.gms.ads.internal.client.zzeh r0) {
            android.os.Bundle r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zze(com.google.android.gms.ads.internal.client.zzeh r0) {
            java.lang.String r0 = r0.zzm
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzf(com.google.android.gms.ads.internal.client.zzeh r0) {
            java.lang.String r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzg(com.google.android.gms.ads.internal.client.zzeh r0) {
            java.lang.String r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzh(com.google.android.gms.ads.internal.client.zzeh r0) {
            java.lang.String r0 = r0.zzj
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.HashMap zzi(com.google.android.gms.ads.internal.client.zzeh r0) {
            java.util.HashMap r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.HashSet zzj(com.google.android.gms.ads.internal.client.zzeh r0) {
            java.util.HashSet r0 = r0.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.HashSet zzk(com.google.android.gms.ads.internal.client.zzeh r0) {
            java.util.HashSet r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.HashSet zzl(com.google.android.gms.ads.internal.client.zzeh r0) {
            java.util.HashSet r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List zzm(com.google.android.gms.ads.internal.client.zzeh r0) {
            java.util.List r0 = r0.zzh
            return r0
    }

    public final void zzA(android.os.Bundle r2) {
            r1 = this;
            android.os.Bundle r0 = r1.zzb
            r0.putAll(r2)
            return
    }

    public final void zzB(java.lang.String r1) {
            r0 = this;
            r0.zzi = r1
            return
    }

    public final void zzC(java.lang.String r1) {
            r0 = this;
            r0.zzj = r1
            return
    }

    @java.lang.Deprecated
    public final void zzD(boolean r1) {
            r0 = this;
            r0.zzk = r1
            return
    }

    public final void zzn(java.lang.String r2) {
            r1 = this;
            java.util.HashSet r0 = r1.zzf
            r0.add(r2)
            return
    }

    public final void zzo(java.lang.Class r4, android.os.Bundle r5) {
            r3 = this;
            android.os.Bundle r0 = r3.zzb
            java.lang.String r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 != 0) goto L14
            android.os.Bundle r0 = r3.zzb
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r0.putBundle(r1, r2)
        L14:
            android.os.Bundle r0 = r3.zzb
            android.os.Bundle r0 = r0.getBundle(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r4 = r4.getName()
            r0.putBundle(r4, r5)
            return
    }

    public final void zzp(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.os.Bundle r0 = r1.zze
            r0.putString(r2, r3)
            return
    }

    public final void zzq(java.lang.String r2) {
            r1 = this;
            java.util.HashSet r0 = r1.zza
            r0.add(r2)
            return
    }

    public final void zzr(java.lang.Class r2, android.os.Bundle r3) {
            r1 = this;
            android.os.Bundle r0 = r1.zzb
            java.lang.String r2 = r2.getName()
            r0.putBundle(r2, r3)
            return
    }

    @java.lang.Deprecated
    public final void zzs(com.google.android.gms.ads.mediation.NetworkExtras r3) {
            r2 = this;
            java.util.HashMap r0 = r2.zzc
            java.lang.Class r1 = r3.getClass()
            r0.put(r1, r3)
            return
    }

    public final void zzt(java.lang.String r2) {
            r1 = this;
            java.util.HashSet r0 = r1.zzd
            r0.add(r2)
            return
    }

    public final void zzu(java.lang.String r2) {
            r1 = this;
            java.util.HashSet r2 = r1.zzd
            java.lang.String r0 = "B3EEABB8EE11C2BE770B684D95219ECB"
            r2.remove(r0)
            return
    }

    public final void zzv(java.lang.String r1) {
            r0 = this;
            r0.zzm = r1
            return
    }

    public final void zzw(java.lang.String r1) {
            r0 = this;
            r0.zzg = r1
            return
    }

    public final void zzx(int r1) {
            r0 = this;
            r0.zzn = r1
            return
    }

    @java.lang.Deprecated
    public final void zzy(boolean r1) {
            r0 = this;
            r0.zzl = r1
            return
    }

    public final void zzz(java.util.List r3) {
            r2 = this;
            java.util.List r0 = r2.zzh
            r0.clear()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L21
            java.lang.String r0 = "neighboring content URL should not be null or empty"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            goto L9
        L21:
            java.util.List r1 = r2.zzh
            r1.add(r0)
            goto L9
        L27:
            return
    }
}
