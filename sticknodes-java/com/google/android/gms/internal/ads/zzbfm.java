package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbfm extends com.google.android.gms.internal.ads.zzbfu {
    static final int zza = 0;
    static final int zzb = 0;
    private static final int zzc = 0;
    private final java.lang.String zzd;
    private final java.util.List zze;
    private final java.util.List zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
            r0 = 12
            r1 = 174(0xae, float:2.44E-43)
            r2 = 206(0xce, float:2.89E-43)
            int r0 = android.graphics.Color.rgb(r0, r1, r2)
            com.google.android.gms.internal.ads.zzbfm.zzc = r0
            r1 = 204(0xcc, float:2.86E-43)
            int r1 = android.graphics.Color.rgb(r1, r1, r1)
            com.google.android.gms.internal.ads.zzbfm.zza = r1
            com.google.android.gms.internal.ads.zzbfm.zzb = r0
            return
    }

    public zzbfm(java.lang.String r2, java.util.List r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.Integer r6, int r7, int r8, boolean r9) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r1.zze = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r1.zzf = r9
            r1.zzd = r2
            r2 = 0
        L14:
            int r9 = r3.size()
            if (r2 >= r9) goto L2d
            java.lang.Object r9 = r3.get(r2)
            com.google.android.gms.internal.ads.zzbfp r9 = (com.google.android.gms.internal.ads.zzbfp) r9
            java.util.List r0 = r1.zze
            r0.add(r9)
            java.util.List r0 = r1.zzf
            r0.add(r9)
            int r2 = r2 + 1
            goto L14
        L2d:
            if (r4 == 0) goto L34
            int r2 = r4.intValue()
            goto L36
        L34:
            int r2 = com.google.android.gms.internal.ads.zzbfm.zza
        L36:
            r1.zzg = r2
            if (r5 == 0) goto L3f
            int r2 = r5.intValue()
            goto L41
        L3f:
            int r2 = com.google.android.gms.internal.ads.zzbfm.zzb
        L41:
            r1.zzh = r2
            if (r6 == 0) goto L4a
            int r2 = r6.intValue()
            goto L4c
        L4a:
            r2 = 12
        L4c:
            r1.zzi = r2
            r1.zzj = r7
            r1.zzk = r8
            return
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zzj
            return r0
    }

    public final int zzc() {
            r1 = this;
            int r0 = r1.zzk
            return r0
    }

    public final int zzd() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }

    public final int zze() {
            r1 = this;
            int r0 = r1.zzh
            return r0
    }

    public final int zzf() {
            r1 = this;
            int r0 = r1.zzi
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final java.lang.String zzg() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final java.util.List zzh() {
            r1 = this;
            java.util.List r0 = r1.zzf
            return r0
    }

    public final java.util.List zzi() {
            r1 = this;
            java.util.List r0 = r1.zze
            return r0
    }
}
