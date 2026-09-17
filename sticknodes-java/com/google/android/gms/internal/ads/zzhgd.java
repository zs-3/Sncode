package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhgd extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzhgd zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
            com.google.android.gms.internal.ads.zzhgd r0 = new com.google.android.gms.internal.ads.zzhgd
            r0.<init>()
            com.google.android.gms.internal.ads.zzhgd.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzhgd> r1 = com.google.android.gms.internal.ads.zzhgd.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzhgd() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhgd zzc() {
            com.google.android.gms.internal.ads.zzhgd r0 = com.google.android.gms.internal.ads.zzhgd.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r3 = r3.ordinal()
            r4 = 0
            r5 = 1
            switch(r3) {
                case 0: goto L60;
                case 1: goto L5f;
                case 2: goto L38;
                case 3: goto L32;
                case 4: goto L2c;
                case 5: goto L29;
                case 6: goto Lf;
                default: goto L9;
            }
        L9:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
        Lf:
            com.google.android.gms.internal.ads.zzhcx r3 = com.google.android.gms.internal.ads.zzhgd.zzb
            if (r3 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzhgd> r4 = com.google.android.gms.internal.ads.zzhgd.class
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzhcx r3 = com.google.android.gms.internal.ads.zzhgd.zzb     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r3 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzhgd r5 = com.google.android.gms.internal.ads.zzhgd.zza     // Catch: java.lang.Throwable -> L25
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzhgd.zzb = r3     // Catch: java.lang.Throwable -> L25
        L23:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            goto L28
        L25:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            throw r3
        L28:
            return r3
        L29:
            com.google.android.gms.internal.ads.zzhgd r3 = com.google.android.gms.internal.ads.zzhgd.zza
            return r3
        L2c:
            com.google.android.gms.internal.ads.zzhgc r3 = new com.google.android.gms.internal.ads.zzhgc
            r3.<init>(r4)
            return r3
        L32:
            com.google.android.gms.internal.ads.zzhgd r3 = new com.google.android.gms.internal.ads.zzhgd
            r3.<init>()
            return r3
        L38:
            java.lang.String r3 = "zzc"
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r3
            java.lang.String r3 = "zzd"
            r4[r5] = r3
            r3 = 5
            r5 = 2
            com.google.android.gms.internal.ads.zzhbk r0 = com.google.android.gms.internal.ads.zzhgb.zza
            r4[r5] = r0
            r5 = 3
            java.lang.String r1 = "zze"
            r4[r5] = r1
            r5 = 4
            java.lang.String r1 = "zzf"
            r4[r5] = r1
            r4[r3] = r0
            com.google.android.gms.internal.ads.zzhgd r3 = com.google.android.gms.internal.ads.zzhgd.zza
            java.lang.String r5 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002"
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzhbe.zzbS(r3, r5, r4)
            return r3
        L5f:
            return r4
        L60:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r5)
            return r3
    }
}
