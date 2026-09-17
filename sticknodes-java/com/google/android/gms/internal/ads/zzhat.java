package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhat {
    private static final com.google.android.gms.internal.ads.zzhat zzb = null;
    final com.google.android.gms.internal.ads.zzhdu zza;
    private boolean zzc;
    private boolean zzd;

    static {
            com.google.android.gms.internal.ads.zzhat r0 = new com.google.android.gms.internal.ads.zzhat
            r1 = 1
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzhat.zzb = r0
            return
    }

    private zzhat() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzhdn r0 = new com.google.android.gms.internal.ads.zzhdn
            r0.<init>()
            r1.zza = r0
            return
    }

    private zzhat(boolean r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzhdn r1 = new com.google.android.gms.internal.ads.zzhdn
            r1.<init>()
            r0.<init>()
            r0.zza = r1
            r0.zzg()
            r0.zzg()
            return
    }

    static int zza(com.google.android.gms.internal.ads.zzhel r2, int r3, java.lang.Object r4) {
            int r3 = r3 << 3
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzD(r3)
            com.google.android.gms.internal.ads.zzhel r0 = com.google.android.gms.internal.ads.zzhel.zzj
            if (r2 != r0) goto L19
            r0 = r4
            com.google.android.gms.internal.ads.zzhcp r0 = (com.google.android.gms.internal.ads.zzhcp) r0
            byte[] r1 = com.google.android.gms.internal.ads.zzhbr.zzb
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgzc
            if (r1 != 0) goto L15
            int r3 = r3 + r3
            goto L19
        L15:
            com.google.android.gms.internal.ads.zzgzc r0 = (com.google.android.gms.internal.ads.zzgzc) r0
            r2 = 0
            throw r2
        L19:
            int r2 = zzb(r2, r4)
            int r3 = r3 + r2
            return r3
    }

    static int zzb(com.google.android.gms.internal.ads.zzhel r3, java.lang.Object r4) {
            com.google.android.gms.internal.ads.zzhel r0 = com.google.android.gms.internal.ads.zzhel.zza
            com.google.android.gms.internal.ads.zzhem r0 = com.google.android.gms.internal.ads.zzhem.zza
            int r3 = r3.ordinal()
            r0 = 4
            r1 = 8
            switch(r3) {
                case 0: goto L106;
                case 1: goto Lfe;
                case 2: goto Lf3;
                case 3: goto Le8;
                case 4: goto Ldc;
                case 5: goto Ld4;
                case 6: goto Lcc;
                case 7: goto Lc3;
                case 8: goto Lab;
                case 9: goto La2;
                case 10: goto L8a;
                case 11: goto L6e;
                case 12: goto L63;
                case 13: goto L47;
                case 14: goto L3f;
                case 15: goto L37;
                case 16: goto L27;
                case 17: goto L16;
                default: goto Le;
            }
        Le:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "There is no way to get here, but the compiler thinks otherwise."
            r3.<init>(r4)
            throw r3
        L16:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            long r0 = r3 + r3
            r2 = 63
            long r3 = r3 >> r2
            long r3 = r3 ^ r0
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
            return r3
        L27:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r4 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzD(r3)
            return r3
        L37:
            java.lang.Long r4 = (java.lang.Long) r4
            r4.longValue()
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzf
            return r1
        L3f:
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.intValue()
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzf
            return r0
        L47:
            boolean r3 = r4 instanceof com.google.android.gms.internal.ads.zzhbi
            if (r3 == 0) goto L57
            com.google.android.gms.internal.ads.zzhbi r4 = (com.google.android.gms.internal.ads.zzhbi) r4
            int r3 = r4.zza()
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
            return r3
        L57:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
            return r3
        L63:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzD(r3)
            return r3
        L6e:
            boolean r3 = r4 instanceof com.google.android.gms.internal.ads.zzgzs
            if (r3 == 0) goto L80
            com.google.android.gms.internal.ads.zzgzs r4 = (com.google.android.gms.internal.ads.zzgzs) r4
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzf
            int r3 = r4.zzd()
            int r4 = com.google.android.gms.internal.ads.zzhaj.zzD(r3)
        L7e:
            int r4 = r4 + r3
            return r4
        L80:
            byte[] r4 = (byte[]) r4
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzf
            int r3 = r4.length
            int r4 = com.google.android.gms.internal.ads.zzhaj.zzD(r3)
            goto L7e
        L8a:
            boolean r3 = r4 instanceof com.google.android.gms.internal.ads.zzhbz
            if (r3 == 0) goto L9b
            com.google.android.gms.internal.ads.zzhbz r4 = (com.google.android.gms.internal.ads.zzhbz) r4
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzf
            int r3 = r4.zza()
            int r4 = com.google.android.gms.internal.ads.zzhaj.zzD(r3)
            goto L7e
        L9b:
            com.google.android.gms.internal.ads.zzhcp r4 = (com.google.android.gms.internal.ads.zzhcp) r4
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzz(r4)
            return r3
        La2:
            com.google.android.gms.internal.ads.zzhcp r4 = (com.google.android.gms.internal.ads.zzhcp) r4
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzf
            int r3 = r4.zzaY()
            return r3
        Lab:
            boolean r3 = r4 instanceof com.google.android.gms.internal.ads.zzgzs
            if (r3 == 0) goto Lbc
            com.google.android.gms.internal.ads.zzgzs r4 = (com.google.android.gms.internal.ads.zzgzs) r4
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzf
            int r3 = r4.zzd()
            int r4 = com.google.android.gms.internal.ads.zzhaj.zzD(r3)
            goto L7e
        Lbc:
            java.lang.String r4 = (java.lang.String) r4
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzC(r4)
            return r3
        Lc3:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzf
            r3 = 1
            return r3
        Lcc:
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.intValue()
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzf
            return r0
        Ld4:
            java.lang.Long r4 = (java.lang.Long) r4
            r4.longValue()
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzf
            return r1
        Ldc:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
            return r3
        Le8:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
            return r3
        Lf3:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
            return r3
        Lfe:
            java.lang.Float r4 = (java.lang.Float) r4
            r4.floatValue()
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzf
            return r0
        L106:
            java.lang.Double r4 = (java.lang.Double) r4
            r4.doubleValue()
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzf
            return r1
    }

    public static int zzc(com.google.android.gms.internal.ads.zzhas r5, java.lang.Object r6) {
            com.google.android.gms.internal.ads.zzhel r0 = r5.zzb()
            int r1 = r5.zza()
            boolean r2 = r5.zze()
            if (r2 == 0) goto L4e
            java.util.List r6 = (java.util.List) r6
            int r2 = r6.size()
            boolean r5 = r5.zzd()
            r3 = 0
            if (r5 == 0) goto L3e
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L3d
            r5 = 0
        L22:
            if (r3 >= r2) goto L30
            java.lang.Object r4 = r6.get(r3)
            int r4 = zzb(r0, r4)
            int r5 = r5 + r4
            int r3 = r3 + 1
            goto L22
        L30:
            int r6 = r1 << 3
            int r6 = com.google.android.gms.internal.ads.zzhaj.zzD(r6)
            int r6 = r6 + r5
            int r5 = com.google.android.gms.internal.ads.zzhaj.zzD(r5)
            int r6 = r6 + r5
            return r6
        L3d:
            return r3
        L3e:
            r5 = 0
        L3f:
            if (r3 >= r2) goto L4d
            java.lang.Object r4 = r6.get(r3)
            int r4 = zza(r0, r1, r4)
            int r5 = r5 + r4
            int r3 = r3 + 1
            goto L3f
        L4d:
            return r5
        L4e:
            int r5 = zza(r0, r1, r6)
            return r5
    }

    public static com.google.android.gms.internal.ads.zzhat zze() {
            com.google.android.gms.internal.ads.zzhat r0 = com.google.android.gms.internal.ads.zzhat.zzb
            return r0
    }

    private static boolean zzj(java.util.Map.Entry r4) {
            java.lang.Object r0 = r4.getKey()
            com.google.android.gms.internal.ads.zzhas r0 = (com.google.android.gms.internal.ads.zzhas) r0
            com.google.android.gms.internal.ads.zzhem r1 = r0.zzc()
            com.google.android.gms.internal.ads.zzhem r2 = com.google.android.gms.internal.ads.zzhem.zzi
            if (r1 != r2) goto L39
            boolean r0 = r0.zze()
            if (r0 == 0) goto L30
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            int r0 = r4.size()
            r1 = 0
            r2 = 0
        L20:
            if (r2 >= r0) goto L39
            java.lang.Object r3 = r4.get(r2)
            boolean r3 = zzk(r3)
            if (r3 != 0) goto L2d
            return r1
        L2d:
            int r2 = r2 + 1
            goto L20
        L30:
            java.lang.Object r4 = r4.getValue()
            boolean r4 = zzk(r4)
            return r4
        L39:
            r4 = 1
            return r4
    }

    private static boolean zzk(java.lang.Object r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzhcq
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.ads.zzhcq r1 = (com.google.android.gms.internal.ads.zzhcq) r1
            boolean r1 = r1.zzbw()
            return r1
        Lb:
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.zzhbz
            if (r1 == 0) goto L11
            r1 = 1
            return r1
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong object type used with protocol message reflection."
            r1.<init>(r0)
            throw r1
    }

    private static final int zzl(java.util.Map.Entry r5) {
            java.lang.Object r0 = r5.getKey()
            com.google.android.gms.internal.ads.zzhas r0 = (com.google.android.gms.internal.ads.zzhas) r0
            java.lang.Object r1 = r5.getValue()
            com.google.android.gms.internal.ads.zzhem r2 = r0.zzc()
            com.google.android.gms.internal.ads.zzhem r3 = com.google.android.gms.internal.ads.zzhem.zzi
            if (r2 != r3) goto L77
            boolean r2 = r0.zze()
            if (r2 != 0) goto L77
            boolean r2 = r0.zzd()
            if (r2 != 0) goto L77
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzhbz
            r2 = 24
            r3 = 16
            r4 = 8
            if (r0 == 0) goto L53
            java.lang.Object r5 = r5.getKey()
            com.google.android.gms.internal.ads.zzhas r5 = (com.google.android.gms.internal.ads.zzhas) r5
            int r5 = r5.zza()
            com.google.android.gms.internal.ads.zzhbz r1 = (com.google.android.gms.internal.ads.zzhbz) r1
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzD(r4)
            int r0 = r0 + r0
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzD(r3)
            int r5 = com.google.android.gms.internal.ads.zzhaj.zzD(r5)
            int r3 = r3 + r5
            int r5 = com.google.android.gms.internal.ads.zzhaj.zzD(r2)
            int r1 = r1.zza()
            int r2 = com.google.android.gms.internal.ads.zzhaj.zzD(r1)
            int r2 = r2 + r1
            int r5 = r5 + r2
        L50:
            int r0 = r0 + r3
            int r0 = r0 + r5
            return r0
        L53:
            java.lang.Object r5 = r5.getKey()
            com.google.android.gms.internal.ads.zzhas r5 = (com.google.android.gms.internal.ads.zzhas) r5
            int r5 = r5.zza()
            com.google.android.gms.internal.ads.zzhcp r1 = (com.google.android.gms.internal.ads.zzhcp) r1
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzD(r4)
            int r0 = r0 + r0
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzD(r3)
            int r5 = com.google.android.gms.internal.ads.zzhaj.zzD(r5)
            int r3 = r3 + r5
            int r5 = com.google.android.gms.internal.ads.zzhaj.zzD(r2)
            int r1 = com.google.android.gms.internal.ads.zzhaj.zzz(r1)
            int r5 = r5 + r1
            goto L50
        L77:
            int r5 = zzc(r0, r1)
            return r5
    }

    private static final void zzm(com.google.android.gms.internal.ads.zzhas r4, java.lang.Object r5) {
            com.google.android.gms.internal.ads.zzhel r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.ads.zzhbr.zzb
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.ads.zzhel r1 = com.google.android.gms.internal.ads.zzhel.zza
            com.google.android.gms.internal.ads.zzhem r1 = com.google.android.gms.internal.ads.zzhem.zza
            com.google.android.gms.internal.ads.zzhem r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhcp
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhbz
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhbi
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgzs
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.ads.zzhel r4 = r4.zzb()
            com.google.android.gms.internal.ads.zzhem r4 = r4.zza()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r5 = this;
            com.google.android.gms.internal.ads.zzhat r0 = new com.google.android.gms.internal.ads.zzhat
            r0.<init>()
            com.google.android.gms.internal.ads.zzhdu r1 = r5.zza
            int r1 = r1.zzc()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L27
            com.google.android.gms.internal.ads.zzhdu r3 = r5.zza
            java.util.Map$Entry r3 = r3.zzg(r2)
            r4 = r3
            com.google.android.gms.internal.ads.zzhdo r4 = (com.google.android.gms.internal.ads.zzhdo) r4
            java.lang.Comparable r4 = r4.zza()
            com.google.android.gms.internal.ads.zzhas r4 = (com.google.android.gms.internal.ads.zzhas) r4
            java.lang.Object r3 = r3.getValue()
            r0.zzh(r4, r3)
            int r2 = r2 + 1
            goto Lc
        L27:
            com.google.android.gms.internal.ads.zzhdu r1 = r5.zza
            java.lang.Iterable r1 = r1.zzd()
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.ads.zzhas r3 = (com.google.android.gms.internal.ads.zzhas) r3
            java.lang.Object r2 = r2.getValue()
            r0.zzh(r3, r2)
            goto L31
        L4b:
            boolean r1 = r5.zzd
            r0.zzd = r1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzhat
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.ads.zzhat r2 = (com.google.android.gms.internal.ads.zzhat) r2
            com.google.android.gms.internal.ads.zzhdu r0 = r1.zza
            com.google.android.gms.internal.ads.zzhdu r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhdu r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final int zzd() {
            r4 = this;
            com.google.android.gms.internal.ads.zzhdu r0 = r4.zza
            int r0 = r0.zzc()
            r1 = 0
            r2 = 0
        L8:
            if (r1 >= r0) goto L18
            com.google.android.gms.internal.ads.zzhdu r3 = r4.zza
            java.util.Map$Entry r3 = r3.zzg(r1)
            int r3 = zzl(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L8
        L18:
            com.google.android.gms.internal.ads.zzhdu r0 = r4.zza
            java.lang.Iterable r0 = r0.zzd()
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r1 = zzl(r1)
            int r2 = r2 + r1
            goto L22
        L34:
            return r2
    }

    public final java.util.Iterator zzf() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhdu r0 = r2.zza
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.util.Iterator r0 = java.util.Collections.emptyIterator()
            return r0
        Ld:
            boolean r0 = r2.zzd
            if (r0 == 0) goto L21
            com.google.android.gms.internal.ads.zzhdu r0 = r2.zza
            com.google.android.gms.internal.ads.zzhby r1 = new com.google.android.gms.internal.ads.zzhby
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            return r1
        L21:
            com.google.android.gms.internal.ads.zzhdu r0 = r2.zza
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public final void zzg() {
            r4 = this;
            boolean r0 = r4.zzc
            if (r0 == 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzhdu r0 = r4.zza
            int r0 = r0.zzc()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L28
            com.google.android.gms.internal.ads.zzhdu r2 = r4.zza
            java.util.Map$Entry r2 = r2.zzg(r1)
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.zzhbe
            if (r3 == 0) goto L25
            java.lang.Object r2 = r2.getValue()
            com.google.android.gms.internal.ads.zzhbe r2 = (com.google.android.gms.internal.ads.zzhbe) r2
            r2.zzbW()
        L25:
            int r1 = r1 + 1
            goto Lc
        L28:
            com.google.android.gms.internal.ads.zzhdu r0 = r4.zza
            r0.zza()
            r0 = 1
            r4.zzc = r0
            return
    }

    public final void zzh(com.google.android.gms.internal.ads.zzhas r5, java.lang.Object r6) {
            r4 = this;
            boolean r0 = r5.zze()
            if (r0 == 0) goto L2f
            boolean r0 = r6 instanceof java.util.List
            if (r0 == 0) goto L27
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L16:
            if (r2 >= r0) goto L25
            java.lang.Object r3 = r6.get(r2)
            zzm(r5, r3)
            r1.add(r3)
            int r2 = r2 + 1
            goto L16
        L25:
            r6 = r1
            goto L32
        L27:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Wrong object type used with protocol message reflection."
            r5.<init>(r6)
            throw r5
        L2f:
            zzm(r5, r6)
        L32:
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzhbz
            if (r0 == 0) goto L39
            r0 = 1
            r4.zzd = r0
        L39:
            com.google.android.gms.internal.ads.zzhdu r0 = r4.zza
            r0.zzf(r5, r6)
            return
    }

    public final boolean zzi() {
            r4 = this;
            com.google.android.gms.internal.ads.zzhdu r0 = r4.zza
            int r0 = r0.zzc()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1a
            com.google.android.gms.internal.ads.zzhdu r3 = r4.zza
            java.util.Map$Entry r3 = r3.zzg(r2)
            boolean r3 = zzj(r3)
            if (r3 != 0) goto L17
            return r1
        L17:
            int r2 = r2 + 1
            goto L8
        L1a:
            com.google.android.gms.internal.ads.zzhdu r0 = r4.zza
            java.lang.Iterable r0 = r0.zzd()
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = zzj(r2)
            if (r2 != 0) goto L24
            return r1
        L37:
            r0 = 1
            return r0
    }
}
