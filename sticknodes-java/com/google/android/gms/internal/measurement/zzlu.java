package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zzlu {
    private static final com.google.android.gms.internal.measurement.zzlu zzb = null;
    final com.google.android.gms.internal.measurement.zzoa zza;
    private boolean zzc;
    private boolean zzd;

    static {
            com.google.android.gms.internal.measurement.zzlu r0 = new com.google.android.gms.internal.measurement.zzlu
            r1 = 1
            r0.<init>(r1)
            com.google.android.gms.internal.measurement.zzlu.zzb = r0
            return
    }

    private zzlu() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.measurement.zznv r0 = new com.google.android.gms.internal.measurement.zznv
            r0.<init>()
            r1.zza = r0
            return
    }

    private zzlu(boolean r1) {
            r0 = this;
            com.google.android.gms.internal.measurement.zznv r1 = new com.google.android.gms.internal.measurement.zznv
            r1.<init>()
            r0.<init>()
            r0.zza = r1
            r0.zzf()
            r0.zzf()
            return
    }

    static int zza(com.google.android.gms.internal.measurement.zzop r0, int r1, java.lang.Object r2) {
            int r0 = r1 << 3
            com.google.android.gms.internal.measurement.zzlk.zzz(r0)
            com.google.android.gms.internal.measurement.zzop r0 = com.google.android.gms.internal.measurement.zzop.zzj
            r1 = 0
            if (r0 != 0) goto L15
            com.google.android.gms.internal.measurement.zznh r2 = (com.google.android.gms.internal.measurement.zznh) r2
            byte[] r0 = com.google.android.gms.internal.measurement.zzmk.zzb
            boolean r0 = r2 instanceof com.google.android.gms.internal.measurement.zzkp
            if (r0 == 0) goto L15
            com.google.android.gms.internal.measurement.zzkp r2 = (com.google.android.gms.internal.measurement.zzkp) r2
            throw r1
        L15:
            com.google.android.gms.internal.measurement.zzoq r0 = com.google.android.gms.internal.measurement.zzoq.zza
            throw r1
    }

    public static int zzb(com.google.android.gms.internal.measurement.zzlt r5, java.lang.Object r6) {
            com.google.android.gms.internal.measurement.zzop r0 = r5.zzb()
            int r1 = r5.zza()
            boolean r2 = r5.zze()
            if (r2 == 0) goto L49
            java.util.List r6 = (java.util.List) r6
            int r2 = r6.size()
            boolean r5 = r5.zzd()
            r3 = 0
            if (r5 == 0) goto L39
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L38
            if (r2 > 0) goto L2f
            int r5 = r1 << 3
            int r5 = com.google.android.gms.internal.measurement.zzlk.zzz(r5)
            int r6 = com.google.android.gms.internal.measurement.zzlk.zzz(r3)
            int r5 = r5 + r6
            return r5
        L2f:
            r6.get(r3)
            com.google.android.gms.internal.measurement.zzop r5 = com.google.android.gms.internal.measurement.zzop.zza
            com.google.android.gms.internal.measurement.zzoq r5 = com.google.android.gms.internal.measurement.zzoq.zza
            r5 = 0
            throw r5
        L38:
            return r3
        L39:
            r5 = 0
        L3a:
            if (r3 >= r2) goto L48
            java.lang.Object r4 = r6.get(r3)
            int r4 = zza(r0, r1, r4)
            int r5 = r5 + r4
            int r3 = r3 + 1
            goto L3a
        L48:
            return r5
        L49:
            int r5 = zza(r0, r1, r6)
            return r5
    }

    public static com.google.android.gms.internal.measurement.zzlu zzd() {
            com.google.android.gms.internal.measurement.zzlu r0 = com.google.android.gms.internal.measurement.zzlu.zzb
            return r0
    }

    private static boolean zzi(java.util.Map.Entry r4) {
            java.lang.Object r0 = r4.getKey()
            com.google.android.gms.internal.measurement.zzlt r0 = (com.google.android.gms.internal.measurement.zzlt) r0
            com.google.android.gms.internal.measurement.zzoq r1 = r0.zzc()
            com.google.android.gms.internal.measurement.zzoq r2 = com.google.android.gms.internal.measurement.zzoq.zzi
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
            boolean r3 = zzj(r3)
            if (r3 != 0) goto L2d
            return r1
        L2d:
            int r2 = r2 + 1
            goto L20
        L30:
            java.lang.Object r4 = r4.getValue()
            boolean r4 = zzj(r4)
            return r4
        L39:
            r4 = 1
            return r4
    }

    private static boolean zzj(java.lang.Object r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.measurement.zzni
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.measurement.zzni r1 = (com.google.android.gms.internal.measurement.zzni) r1
            boolean r1 = r1.zzcD()
            return r1
        Lb:
            boolean r1 = r1 instanceof com.google.android.gms.internal.measurement.zzmr
            if (r1 == 0) goto L11
            r1 = 1
            return r1
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong object type used with protocol message reflection."
            r1.<init>(r0)
            throw r1
    }

    private static final int zzk(java.util.Map.Entry r5) {
            java.lang.Object r0 = r5.getKey()
            com.google.android.gms.internal.measurement.zzlt r0 = (com.google.android.gms.internal.measurement.zzlt) r0
            java.lang.Object r1 = r5.getValue()
            com.google.android.gms.internal.measurement.zzoq r2 = r0.zzc()
            com.google.android.gms.internal.measurement.zzoq r3 = com.google.android.gms.internal.measurement.zzoq.zzi
            if (r2 != r3) goto L7a
            boolean r2 = r0.zze()
            if (r2 != 0) goto L7a
            boolean r2 = r0.zzd()
            if (r2 != 0) goto L7a
            boolean r0 = r1 instanceof com.google.android.gms.internal.measurement.zzmr
            r2 = 24
            r3 = 16
            r4 = 8
            if (r0 == 0) goto L53
            java.lang.Object r5 = r5.getKey()
            com.google.android.gms.internal.measurement.zzlt r5 = (com.google.android.gms.internal.measurement.zzlt) r5
            int r5 = r5.zza()
            com.google.android.gms.internal.measurement.zzmr r1 = (com.google.android.gms.internal.measurement.zzmr) r1
            int r0 = com.google.android.gms.internal.measurement.zzlk.zzz(r4)
            int r0 = r0 + r0
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzz(r3)
            int r5 = com.google.android.gms.internal.measurement.zzlk.zzz(r5)
            int r3 = r3 + r5
            int r5 = com.google.android.gms.internal.measurement.zzlk.zzz(r2)
            int r1 = r1.zza()
            int r2 = com.google.android.gms.internal.measurement.zzlk.zzz(r1)
        L4e:
            int r2 = r2 + r1
            int r5 = r5 + r2
            int r0 = r0 + r3
            int r0 = r0 + r5
            return r0
        L53:
            java.lang.Object r5 = r5.getKey()
            com.google.android.gms.internal.measurement.zzlt r5 = (com.google.android.gms.internal.measurement.zzlt) r5
            int r5 = r5.zza()
            com.google.android.gms.internal.measurement.zznh r1 = (com.google.android.gms.internal.measurement.zznh) r1
            int r0 = com.google.android.gms.internal.measurement.zzlk.zzz(r4)
            int r0 = r0 + r0
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzz(r3)
            int r5 = com.google.android.gms.internal.measurement.zzlk.zzz(r5)
            int r3 = r3 + r5
            int r5 = com.google.android.gms.internal.measurement.zzlk.zzz(r2)
            int r1 = r1.zzcf()
            int r2 = com.google.android.gms.internal.measurement.zzlk.zzz(r1)
            goto L4e
        L7a:
            int r5 = zzb(r0, r1)
            return r5
    }

    private static final void zzl(com.google.android.gms.internal.measurement.zzlt r4, java.lang.Object r5) {
            com.google.android.gms.internal.measurement.zzop r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.measurement.zzmk.zzb
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.measurement.zzop r1 = com.google.android.gms.internal.measurement.zzop.zza
            com.google.android.gms.internal.measurement.zzoq r1 = com.google.android.gms.internal.measurement.zzoq.zza
            com.google.android.gms.internal.measurement.zzoq r0 = r0.zza()
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
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zznh
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzmr
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzmf
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzld
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
            com.google.android.gms.internal.measurement.zzop r4 = r4.zzb()
            com.google.android.gms.internal.measurement.zzoq r4 = r4.zza()
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
            r6 = this;
            com.google.android.gms.internal.measurement.zzlu r0 = new com.google.android.gms.internal.measurement.zzlu
            r0.<init>()
            com.google.android.gms.internal.measurement.zzoa r1 = r6.zza
            int r2 = r1.zzc()
            r3 = 0
        Lc:
            if (r3 >= r2) goto L25
            java.util.Map$Entry r4 = r1.zzg(r3)
            r5 = r4
            com.google.android.gms.internal.measurement.zznw r5 = (com.google.android.gms.internal.measurement.zznw) r5
            java.lang.Comparable r5 = r5.zza()
            com.google.android.gms.internal.measurement.zzlt r5 = (com.google.android.gms.internal.measurement.zzlt) r5
            java.lang.Object r4 = r4.getValue()
            r0.zzg(r5, r4)
            int r3 = r3 + 1
            goto Lc
        L25:
            java.lang.Iterable r1 = r1.zzd()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.measurement.zzlt r3 = (com.google.android.gms.internal.measurement.zzlt) r3
            java.lang.Object r2 = r2.getValue()
            r0.zzg(r3, r2)
            goto L2d
        L47:
            boolean r1 = r6.zzd
            r0.zzd = r1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.measurement.zzlu
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.measurement.zzlu r2 = (com.google.android.gms.internal.measurement.zzlu) r2
            com.google.android.gms.internal.measurement.zzoa r0 = r1.zza
            com.google.android.gms.internal.measurement.zzoa r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzoa r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final int zzc() {
            r5 = this;
            com.google.android.gms.internal.measurement.zzoa r0 = r5.zza
            int r1 = r0.zzc()
            r2 = 0
            r3 = 0
        L8:
            if (r2 >= r1) goto L16
            java.util.Map$Entry r4 = r0.zzg(r2)
            int r4 = zzk(r4)
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L8
        L16:
            java.lang.Iterable r0 = r0.zzd()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r1 = zzk(r1)
            int r3 = r3 + r1
            goto L1e
        L30:
            return r3
    }

    public final java.util.Iterator zze() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzoa r0 = r2.zza
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            java.util.Iterator r0 = java.util.Collections.emptyIterator()
            return r0
        Ld:
            boolean r1 = r2.zzd
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.measurement.zzmp r1 = new com.google.android.gms.internal.measurement.zzmp
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            return r1
        L1f:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public final void zzf() {
            r5 = this;
            boolean r0 = r5.zzc
            if (r0 == 0) goto L5
            return
        L5:
            com.google.android.gms.internal.measurement.zzoa r0 = r5.zza
            int r1 = r0.zzc()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L22
            java.util.Map$Entry r3 = r0.zzg(r2)
            java.lang.Object r3 = r3.getValue()
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.zzmd
            if (r4 == 0) goto L1f
            com.google.android.gms.internal.measurement.zzmd r3 = (com.google.android.gms.internal.measurement.zzmd) r3
            r3.zzcr()
        L1f:
            int r2 = r2 + 1
            goto Lc
        L22:
            java.lang.Iterable r1 = r0.zzd()
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzmd
            if (r3 == 0) goto L2a
            com.google.android.gms.internal.measurement.zzmd r2 = (com.google.android.gms.internal.measurement.zzmd) r2
            r2.zzcr()
            goto L2a
        L44:
            r0.zza()
            r0 = 1
            r5.zzc = r0
            return
    }

    public final void zzg(com.google.android.gms.internal.measurement.zzlt r5, java.lang.Object r6) {
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
            zzl(r5, r3)
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
            zzl(r5, r6)
        L32:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzmr
            if (r0 == 0) goto L39
            r0 = 1
            r4.zzd = r0
        L39:
            com.google.android.gms.internal.measurement.zzoa r0 = r4.zza
            r0.zzf(r5, r6)
            return
    }

    public final boolean zzh() {
            r5 = this;
            com.google.android.gms.internal.measurement.zzoa r0 = r5.zza
            int r1 = r0.zzc()
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r1) goto L18
            java.util.Map$Entry r4 = r0.zzg(r3)
            boolean r4 = zzi(r4)
            if (r4 != 0) goto L15
            return r2
        L15:
            int r3 = r3 + 1
            goto L8
        L18:
            java.lang.Iterable r0 = r0.zzd()
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r1 = zzi(r1)
            if (r1 != 0) goto L20
            return r2
        L33:
            r0 = 1
            return r0
    }
}
