package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzei {
    private final java.lang.String zza;
    private final java.util.List zzb;
    private final java.util.Set zzc;
    private final android.os.Bundle zzd;
    private final java.util.Map zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;
    private final com.google.android.gms.ads.search.SearchAdRequest zzh;
    private final int zzi;
    private final java.util.Set zzj;
    private final android.os.Bundle zzk;
    private final java.util.Set zzl;
    private final boolean zzm;
    private final java.lang.String zzn;
    private final int zzo;
    private long zzp;

    public zzei(com.google.android.gms.ads.internal.client.zzeh r3, com.google.android.gms.ads.search.SearchAdRequest r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzp = r0
            java.lang.String r0 = com.google.android.gms.ads.internal.client.zzeh.zzf(r3)
            r2.zza = r0
            java.util.List r0 = com.google.android.gms.ads.internal.client.zzeh.zzm(r3)
            r2.zzb = r0
            java.util.HashSet r0 = com.google.android.gms.ads.internal.client.zzeh.zzk(r3)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            r2.zzc = r0
            android.os.Bundle r0 = com.google.android.gms.ads.internal.client.zzeh.zzd(r3)
            r2.zzd = r0
            java.util.HashMap r0 = com.google.android.gms.ads.internal.client.zzeh.zzi(r3)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            r2.zze = r0
            java.lang.String r0 = com.google.android.gms.ads.internal.client.zzeh.zzg(r3)
            r2.zzf = r0
            java.lang.String r0 = com.google.android.gms.ads.internal.client.zzeh.zzh(r3)
            r2.zzg = r0
            r2.zzh = r4
            int r4 = com.google.android.gms.ads.internal.client.zzeh.zzb(r3)
            r2.zzi = r4
            java.util.HashSet r4 = com.google.android.gms.ads.internal.client.zzeh.zzl(r3)
            java.util.Set r4 = java.util.Collections.unmodifiableSet(r4)
            r2.zzj = r4
            android.os.Bundle r4 = com.google.android.gms.ads.internal.client.zzeh.zzc(r3)
            r2.zzk = r4
            java.util.HashSet r4 = com.google.android.gms.ads.internal.client.zzeh.zzj(r3)
            java.util.Set r4 = java.util.Collections.unmodifiableSet(r4)
            r2.zzl = r4
            boolean r4 = com.google.android.gms.ads.internal.client.zzeh.zzE(r3)
            r2.zzm = r4
            java.lang.String r4 = com.google.android.gms.ads.internal.client.zzeh.zze(r3)
            r2.zzn = r4
            int r3 = com.google.android.gms.ads.internal.client.zzeh.zza(r3)
            r2.zzo = r3
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzo
            return r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zzi
            return r0
    }

    public final long zzc() {
            r2 = this;
            long r0 = r2.zzp
            return r0
    }

    public final android.os.Bundle zzd(java.lang.Class r3) {
            r2 = this;
            android.os.Bundle r0 = r2.zzd
            java.lang.String r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 == 0) goto L13
            java.lang.String r3 = r3.getName()
            android.os.Bundle r3 = r0.getBundle(r3)
            return r3
        L13:
            r3 = 0
            return r3
    }

    public final android.os.Bundle zze() {
            r1 = this;
            android.os.Bundle r0 = r1.zzk
            return r0
    }

    public final android.os.Bundle zzf(java.lang.Class r2) {
            r1 = this;
            android.os.Bundle r0 = r1.zzd
            java.lang.String r2 = r2.getName()
            android.os.Bundle r2 = r0.getBundle(r2)
            return r2
    }

    public final android.os.Bundle zzg() {
            r1 = this;
            android.os.Bundle r0 = r1.zzd
            return r0
    }

    @java.lang.Deprecated
    public final com.google.android.gms.ads.mediation.NetworkExtras zzh(java.lang.Class r2) {
            r1 = this;
            java.util.Map r0 = r1.zze
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.ads.mediation.NetworkExtras r2 = (com.google.android.gms.ads.mediation.NetworkExtras) r2
            return r2
    }

    public final com.google.android.gms.ads.search.SearchAdRequest zzi() {
            r1 = this;
            com.google.android.gms.ads.search.SearchAdRequest r0 = r1.zzh
            return r0
    }

    public final java.lang.String zzj() {
            r1 = this;
            java.lang.String r0 = r1.zzn
            return r0
    }

    public final java.lang.String zzk() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final java.lang.String zzl() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    public final java.lang.String zzm() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    public final java.util.List zzn() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r2.zzb
            r0.<init>(r1)
            return r0
    }

    public final java.util.Set zzo() {
            r1 = this;
            java.util.Set r0 = r1.zzl
            return r0
    }

    public final java.util.Set zzp() {
            r1 = this;
            java.util.Set r0 = r1.zzc
            return r0
    }

    public final void zzq(long r1) {
            r0 = this;
            r0.zzp = r1
            return
    }

    @java.lang.Deprecated
    public final boolean zzr() {
            r1 = this;
            boolean r0 = r1.zzm
            return r0
    }

    public final boolean zzs(android.content.Context r3) {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            com.google.android.gms.ads.RequestConfiguration r0 = r0.zzc()
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            java.util.Set r1 = r2.zzj
            java.lang.String r3 = com.google.android.gms.ads.internal.util.client.zzf.zzz(r3)
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L24
            java.util.List r0 = r0.getTestDeviceIds()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L22
            goto L24
        L22:
            r3 = 0
            return r3
        L24:
            r3 = 1
            return r3
    }
}
