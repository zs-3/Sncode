package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzatu extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzatu zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzhbq zzd;
    private com.google.android.gms.internal.ads.zzgzs zze;
    private int zzf;
    private int zzg;

    static {
            com.google.android.gms.internal.ads.zzatu r0 = new com.google.android.gms.internal.ads.zzatu
            r0.<init>()
            com.google.android.gms.internal.ads.zzatu.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzatu> r1 = com.google.android.gms.internal.ads.zzatu.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzatu() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzhbq r0 = com.google.android.gms.internal.ads.zzhbe.zzbK()
            r1.zzd = r0
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzb
            r1.zze = r0
            r0 = 1
            r1.zzf = r0
            r1.zzg = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzatt zza() {
            com.google.android.gms.internal.ads.zzatu r0 = com.google.android.gms.internal.ads.zzatu.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzatt r0 = (com.google.android.gms.internal.ads.zzatt) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzatu zzc() {
            com.google.android.gms.internal.ads.zzatu r0 = com.google.android.gms.internal.ads.zzatu.zza
            return r0
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzatu r2, com.google.android.gms.internal.ads.zzgzs r3) {
            com.google.android.gms.internal.ads.zzhbq r0 = r2.zzd
            boolean r1 = r0.zzc()
            if (r1 != 0) goto Le
            com.google.android.gms.internal.ads.zzhbq r0 = com.google.android.gms.internal.ads.zzhbe.zzbL(r0)
            r2.zzd = r0
        Le:
            com.google.android.gms.internal.ads.zzhbq r2 = r2.zzd
            r2.add(r3)
            return
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzatu r1, com.google.android.gms.internal.ads.zzgzs r2) {
            int r0 = r1.zzc
            r0 = r0 | 1
            r1.zzc = r0
            r1.zze = r2
            return
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzatu r1, int r2) {
            r2 = 4
            r1.zzg = r2
            int r0 = r1.zzc
            r2 = r2 | r0
            r1.zzc = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2.ordinal()
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L67;
                case 1: goto L66;
                case 2: goto L38;
                case 3: goto L32;
                case 4: goto L2c;
                case 5: goto L29;
                case 6: goto Lf;
                default: goto L9;
            }
        L9:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        Lf:
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzatu.zzb
            if (r2 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzatu> r3 = com.google.android.gms.internal.ads.zzatu.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzatu.zzb     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r2 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzatu r4 = com.google.android.gms.internal.ads.zzatu.zza     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzatu.zzb = r2     // Catch: java.lang.Throwable -> L25
        L23:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            goto L28
        L25:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r2
        L28:
            return r2
        L29:
            com.google.android.gms.internal.ads.zzatu r2 = com.google.android.gms.internal.ads.zzatu.zza
            return r2
        L2c:
            com.google.android.gms.internal.ads.zzatt r2 = new com.google.android.gms.internal.ads.zzatt
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.gms.internal.ads.zzatu r2 = new com.google.android.gms.internal.ads.zzatu
            r2.<init>()
            return r2
        L38:
            java.lang.String r2 = "zzc"
            r3 = 7
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            r3[r0] = r2
            java.lang.String r2 = "zzd"
            r3[r4] = r2
            r2 = 2
            java.lang.String r4 = "zze"
            r3[r2] = r4
            r2 = 3
            java.lang.String r4 = "zzf"
            r3[r2] = r4
            r2 = 4
            com.google.android.gms.internal.ads.zzhbk r4 = com.google.android.gms.internal.ads.zzato.zza
            r3[r2] = r4
            r2 = 5
            java.lang.String r4 = "zzg"
            r3[r2] = r4
            r2 = 6
            com.google.android.gms.internal.ads.zzhbk r4 = com.google.android.gms.internal.ads.zzatm.zza
            r3[r2] = r4
            com.google.android.gms.internal.ads.zzatu r2 = com.google.android.gms.internal.ads.zzatu.zza
            java.lang.String r4 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r4, r3)
            return r2
        L66:
            return r3
        L67:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
    }
}
