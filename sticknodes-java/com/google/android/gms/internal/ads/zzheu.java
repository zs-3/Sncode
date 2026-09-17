package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzheu extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzheu zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private com.google.android.gms.internal.ads.zzhbq zzc;

    static {
            com.google.android.gms.internal.ads.zzheu r0 = new com.google.android.gms.internal.ads.zzheu
            r0.<init>()
            com.google.android.gms.internal.ads.zzheu.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzheu> r1 = com.google.android.gms.internal.ads.zzheu.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzheu() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzhbq r0 = com.google.android.gms.internal.ads.zzhbe.zzbK()
            r1.zzc = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzhet zzc() {
            com.google.android.gms.internal.ads.zzheu r0 = com.google.android.gms.internal.ads.zzheu.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzhet r0 = (com.google.android.gms.internal.ads.zzhet) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzheu zzd() {
            com.google.android.gms.internal.ads.zzheu r0 = com.google.android.gms.internal.ads.zzheu.zza
            return r0
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzheu r2, com.google.android.gms.internal.ads.zzhes r3) {
            r3.getClass()
            com.google.android.gms.internal.ads.zzhbq r0 = r2.zzc
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L11
            com.google.android.gms.internal.ads.zzhbq r0 = com.google.android.gms.internal.ads.zzhbe.zzbL(r0)
            r2.zzc = r0
        L11:
            com.google.android.gms.internal.ads.zzhbq r2 = r2.zzc
            r2.add(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2.ordinal()
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L4e;
                case 1: goto L4d;
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
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzheu.zzb
            if (r2 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzheu> r3 = com.google.android.gms.internal.ads.zzheu.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzheu.zzb     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r2 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzheu r4 = com.google.android.gms.internal.ads.zzheu.zza     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzheu.zzb = r2     // Catch: java.lang.Throwable -> L25
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
            com.google.android.gms.internal.ads.zzheu r2 = com.google.android.gms.internal.ads.zzheu.zza
            return r2
        L2c:
            com.google.android.gms.internal.ads.zzhet r2 = new com.google.android.gms.internal.ads.zzhet
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.gms.internal.ads.zzheu r2 = new com.google.android.gms.internal.ads.zzheu
            r2.<init>()
            return r2
        L38:
            java.lang.String r2 = "zzc"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            r3[r0] = r2
            java.lang.Class<com.google.android.gms.internal.ads.zzhes> r2 = com.google.android.gms.internal.ads.zzhes.class
            r3[r4] = r2
            com.google.android.gms.internal.ads.zzheu r2 = com.google.android.gms.internal.ads.zzheu.zza
            java.lang.String r4 = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r4, r3)
            return r2
        L4d:
            return r3
        L4e:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
    }
}
