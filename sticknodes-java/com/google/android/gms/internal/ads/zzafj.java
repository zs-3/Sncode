package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzafj extends com.google.android.gms.internal.ads.zzafl {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzafj() {
            r2 = this;
            com.google.android.gms.internal.ads.zzacw r0 = new com.google.android.gms.internal.ads.zzacw
            r0.<init>()
            r2.<init>(r0)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzb = r0
            r0 = 0
            long[] r1 = new long[r0]
            r2.zzc = r1
            long[] r0 = new long[r0]
            r2.zzd = r0
            return
    }

    private static java.lang.Double zzg(com.google.android.gms.internal.ads.zzek r2) {
            long r0 = r2.zzt()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static java.lang.Object zzh(com.google.android.gms.internal.ads.zzek r4, int r5) {
            if (r5 == 0) goto L7a
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L6e
            r1 = 2
            if (r5 == r1) goto L69
            r2 = 3
            if (r5 == r2) goto L4d
            r2 = 8
            if (r5 == r2) goto L48
            r2 = 10
            if (r5 == r2) goto L2c
            r0 = 11
            if (r5 == r0) goto L1a
            r4 = 0
            return r4
        L1a:
            java.util.Date r5 = new java.util.Date
            java.lang.Double r0 = zzg(r4)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r5.<init>(r2)
            r4.zzM(r1)
            return r5
        L2c:
            int r5 = r4.zzp()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L35:
            if (r0 >= r5) goto L47
            int r2 = r4.zzm()
            java.lang.Object r2 = zzh(r4, r2)
            if (r2 == 0) goto L44
            r1.add(r2)
        L44:
            int r0 = r0 + 1
            goto L35
        L47:
            return r1
        L48:
            java.util.HashMap r4 = zzj(r4)
            return r4
        L4d:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L52:
            java.lang.String r0 = zzi(r4)
            int r1 = r4.zzm()
            r2 = 9
            if (r1 != r2) goto L5f
            return r5
        L5f:
            java.lang.Object r1 = zzh(r4, r1)
            if (r1 == 0) goto L52
            r5.put(r0, r1)
            goto L52
        L69:
            java.lang.String r4 = zzi(r4)
            return r4
        L6e:
            int r4 = r4.zzm()
            if (r4 != r1) goto L75
            r0 = 1
        L75:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L7a:
            java.lang.Double r4 = zzg(r4)
            return r4
    }

    private static java.lang.String zzi(com.google.android.gms.internal.ads.zzek r3) {
            int r0 = r3.zzq()
            int r1 = r3.zzd()
            r3.zzM(r0)
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r3.zzN()
            r2.<init>(r3, r1, r0)
            return r2
    }

    private static java.util.HashMap zzj(com.google.android.gms.internal.ads.zzek r5) {
            int r0 = r5.zzp()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L20
            java.lang.String r3 = zzi(r5)
            int r4 = r5.zzm()
            java.lang.Object r4 = zzh(r5, r4)
            if (r4 == 0) goto L1d
            r1.put(r3, r4)
        L1d:
            int r2 = r2 + 1
            goto La
        L20:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final boolean zza(com.google.android.gms.internal.ads.zzek r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final boolean zzb(com.google.android.gms.internal.ads.zzek r10, long r11) {
            r9 = this;
            int r11 = r10.zzm()
            r12 = 0
            r0 = 2
            if (r11 == r0) goto La
            goto Lad
        La:
            java.lang.String r11 = zzi(r10)
            java.lang.String r0 = "onMetaData"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto Lad
            int r11 = r10.zzb()
            if (r11 == 0) goto Lad
            int r11 = r10.zzm()
            r0 = 8
            if (r11 != r0) goto Lad
            java.util.HashMap r10 = zzj(r10)
            java.lang.String r11 = "duration"
            java.lang.Object r11 = r10.get(r11)
            boolean r0 = r11 instanceof java.lang.Double
            r1 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r0 == 0) goto L48
            java.lang.Double r11 = (java.lang.Double) r11
            double r3 = r11.doubleValue()
            r5 = 0
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 <= 0) goto L48
            double r3 = r3 * r1
            long r3 = (long) r3
            r9.zzb = r3
        L48:
            java.lang.String r11 = "keyframes"
            java.lang.Object r10 = r10.get(r11)
            boolean r11 = r10 instanceof java.util.Map
            if (r11 == 0) goto Lad
            java.util.Map r10 = (java.util.Map) r10
            java.lang.String r11 = "filepositions"
            java.lang.Object r11 = r10.get(r11)
            java.lang.String r0 = "times"
            java.lang.Object r10 = r10.get(r0)
            boolean r0 = r11 instanceof java.util.List
            if (r0 == 0) goto Lad
            boolean r0 = r10 instanceof java.util.List
            if (r0 == 0) goto Lad
            java.util.List r11 = (java.util.List) r11
            java.util.List r10 = (java.util.List) r10
            int r0 = r10.size()
            long[] r3 = new long[r0]
            r9.zzc = r3
            long[] r3 = new long[r0]
            r9.zzd = r3
            r3 = 0
        L79:
            if (r3 >= r0) goto Lad
            java.lang.Object r4 = r11.get(r3)
            java.lang.Object r5 = r10.get(r3)
            boolean r6 = r5 instanceof java.lang.Double
            if (r6 == 0) goto La5
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto La5
            long[] r6 = r9.zzc
            java.lang.Double r5 = (java.lang.Double) r5
            double r7 = r5.doubleValue()
            double r7 = r7 * r1
            long r7 = (long) r7
            r6[r3] = r7
            long[] r5 = r9.zzd
            java.lang.Double r4 = (java.lang.Double) r4
            long r6 = r4.longValue()
            r5[r3] = r6
            int r3 = r3 + 1
            goto L79
        La5:
            long[] r10 = new long[r12]
            r9.zzc = r10
            long[] r10 = new long[r12]
            r9.zzd = r10
        Lad:
            return r12
    }

    public final long zzc() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    public final long[] zzd() {
            r1 = this;
            long[] r0 = r1.zzd
            return r0
    }

    public final long[] zze() {
            r1 = this;
            long[] r0 = r1.zzc
            return r0
    }
}
