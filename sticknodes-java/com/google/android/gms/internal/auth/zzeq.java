package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzeq {
    private static final com.google.android.gms.internal.auth.zzeq zzb = null;
    final com.google.android.gms.internal.auth.zzgv zza;
    private boolean zzc;
    private boolean zzd;

    static {
            com.google.android.gms.internal.auth.zzeq r0 = new com.google.android.gms.internal.auth.zzeq
            r1 = 1
            r0.<init>(r1)
            com.google.android.gms.internal.auth.zzeq.zzb = r0
            return
    }

    private zzeq() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.auth.zzgl r0 = new com.google.android.gms.internal.auth.zzgl
            r1 = 16
            r0.<init>(r1)
            r2.zza = r0
            return
    }

    private zzeq(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.auth.zzgl r2 = new com.google.android.gms.internal.auth.zzgl
            r0 = 0
            r2.<init>(r0)
            r1.<init>()
            r1.zza = r2
            r1.zzb()
            r1.zzb()
            return
    }

    public static com.google.android.gms.internal.auth.zzeq zza() {
            r0 = 0
            throw r0
    }

    private static final void zzd(com.google.android.gms.internal.auth.zzep r4, java.lang.Object r5) {
            com.google.android.gms.internal.auth.zzho r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.auth.zzfa.zzd
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.auth.zzho r1 = com.google.android.gms.internal.auth.zzho.zza
            com.google.android.gms.internal.auth.zzhp r1 = com.google.android.gms.internal.auth.zzhp.zza
            com.google.android.gms.internal.auth.zzhp r0 = r0.zza()
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
            boolean r0 = r5 instanceof com.google.android.gms.internal.auth.zzfx
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.auth.zzfc
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.auth.zzex
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.auth.zzef
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
            com.google.android.gms.internal.auth.zzho r4 = r4.zzb()
            com.google.android.gms.internal.auth.zzhp r4 = r4.zza()
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
            r4 = this;
            com.google.android.gms.internal.auth.zzeq r0 = new com.google.android.gms.internal.auth.zzeq
            r0.<init>()
            r1 = 0
        L6:
            com.google.android.gms.internal.auth.zzgv r2 = r4.zza
            int r2 = r2.zzb()
            if (r1 >= r2) goto L24
            com.google.android.gms.internal.auth.zzgv r2 = r4.zza
            java.util.Map$Entry r2 = r2.zzg(r1)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.auth.zzep r3 = (com.google.android.gms.internal.auth.zzep) r3
            java.lang.Object r2 = r2.getValue()
            r0.zzc(r3, r2)
            int r1 = r1 + 1
            goto L6
        L24:
            com.google.android.gms.internal.auth.zzgv r1 = r4.zza
            java.lang.Iterable r1 = r1.zzc()
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.auth.zzep r3 = (com.google.android.gms.internal.auth.zzep) r3
            java.lang.Object r2 = r2.getValue()
            r0.zzc(r3, r2)
            goto L2e
        L48:
            boolean r1 = r4.zzd
            r0.zzd = r1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.auth.zzeq
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.auth.zzeq r2 = (com.google.android.gms.internal.auth.zzeq) r2
            com.google.android.gms.internal.auth.zzgv r0 = r1.zza
            com.google.android.gms.internal.auth.zzgv r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.auth.zzgv r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final void zzb() {
            r3 = this;
            boolean r0 = r3.zzc
            if (r0 != 0) goto L2f
            r0 = 0
        L5:
            com.google.android.gms.internal.auth.zzgv r1 = r3.zza
            int r1 = r1.zzb()
            if (r0 >= r1) goto L27
            com.google.android.gms.internal.auth.zzgv r1 = r3.zza
            java.util.Map$Entry r1 = r1.zzg(r0)
            java.lang.Object r2 = r1.getValue()
            boolean r2 = r2 instanceof com.google.android.gms.internal.auth.zzev
            if (r2 == 0) goto L24
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.internal.auth.zzev r1 = (com.google.android.gms.internal.auth.zzev) r1
            r1.zzi()
        L24:
            int r0 = r0 + 1
            goto L5
        L27:
            com.google.android.gms.internal.auth.zzgv r0 = r3.zza
            r0.zza()
            r0 = 1
            r3.zzc = r0
        L2f:
            return
    }

    public final void zzc(com.google.android.gms.internal.auth.zzep r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r4.zzc()
            if (r0 == 0) goto L2f
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L27
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r5 = (java.util.List) r5
            r0.addAll(r5)
            int r5 = r0.size()
            r1 = 0
        L19:
            if (r1 >= r5) goto L25
            java.lang.Object r2 = r0.get(r1)
            zzd(r4, r2)
            int r1 = r1 + 1
            goto L19
        L25:
            r5 = r0
            goto L32
        L27:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Wrong object type used with protocol message reflection."
            r4.<init>(r5)
            throw r4
        L2f:
            zzd(r4, r5)
        L32:
            boolean r0 = r5 instanceof com.google.android.gms.internal.auth.zzfc
            if (r0 == 0) goto L39
            r0 = 1
            r3.zzd = r0
        L39:
            com.google.android.gms.internal.auth.zzgv r0 = r3.zza
            r0.zze(r4, r5)
            return
    }
}
