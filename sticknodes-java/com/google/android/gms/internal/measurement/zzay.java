package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzay extends com.google.android.gms.internal.measurement.zzaw {
    public zzay() {
            r2 = this;
            r2.<init>()
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzx
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzL
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzM
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzN
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzO
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzQ
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzR
            r0.add(r1)
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzbl.zzW
            r0.add(r1)
            return
    }

    private static boolean zzc(com.google.android.gms.internal.measurement.zzap r5, com.google.android.gms.internal.measurement.zzap r6) {
            java.lang.Class r0 = r5.getClass()
            java.lang.Class r1 = r6.getClass()
            boolean r0 = r0.equals(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L77
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzau
            if (r0 != 0) goto L76
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzan
            if (r0 == 0) goto L19
            goto L76
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzah
            if (r0 == 0) goto L50
            java.lang.Double r0 = r5.zzh()
            double r3 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L4f
            java.lang.Double r0 = r6.zzh()
            double r3 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 == 0) goto L3a
            goto L4f
        L3a:
            java.lang.Double r5 = r5.zzh()
            double r3 = r5.doubleValue()
            java.lang.Double r5 = r6.zzh()
            double r5 = r5.doubleValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L4f
            return r2
        L4f:
            return r1
        L50:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzat
            if (r0 == 0) goto L61
            java.lang.String r5 = r5.zzi()
            java.lang.String r6 = r6.zzi()
            boolean r5 = r5.equals(r6)
            return r5
        L61:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzaf
            if (r0 == 0) goto L72
            java.lang.Boolean r5 = r5.zzg()
            java.lang.Boolean r6 = r6.zzg()
            boolean r5 = r5.equals(r6)
            return r5
        L72:
            if (r5 != r6) goto L75
            return r2
        L75:
            return r1
        L76:
            return r2
        L77:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzau
            if (r0 != 0) goto L7f
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzan
            if (r0 == 0) goto L87
        L7f:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzau
            if (r0 != 0) goto L10a
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzan
            if (r0 != 0) goto L10a
        L87:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzah
            if (r0 == 0) goto L9e
            boolean r2 = r6 instanceof com.google.android.gms.internal.measurement.zzat
            if (r2 != 0) goto L90
            goto L9e
        L90:
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r6 = r6.zzh()
            r0.<init>(r6)
            boolean r5 = zzc(r5, r0)
            return r5
        L9e:
            boolean r2 = r5 instanceof com.google.android.gms.internal.measurement.zzat
            if (r2 == 0) goto Lb5
            boolean r3 = r6 instanceof com.google.android.gms.internal.measurement.zzah
            if (r3 != 0) goto La7
            goto Lb5
        La7:
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r5 = r5.zzh()
            r0.<init>(r5)
            boolean r5 = zzc(r0, r6)
            return r5
        Lb5:
            boolean r3 = r5 instanceof com.google.android.gms.internal.measurement.zzaf
            if (r3 == 0) goto Lc7
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r5 = r5.zzh()
            r0.<init>(r5)
            boolean r5 = zzc(r0, r6)
            return r5
        Lc7:
            boolean r3 = r6 instanceof com.google.android.gms.internal.measurement.zzaf
            if (r3 == 0) goto Ld9
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r6 = r6.zzh()
            r0.<init>(r6)
            boolean r5 = zzc(r5, r0)
            return r5
        Ld9:
            if (r2 != 0) goto Ldd
            if (r0 == 0) goto Le1
        Ldd:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzal
            if (r0 != 0) goto Lfc
        Le1:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzal
            if (r0 == 0) goto Lfb
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzat
            if (r0 != 0) goto Led
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzah
            if (r0 == 0) goto Lfb
        Led:
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r5 = r5.zzi()
            r0.<init>(r5)
            boolean r5 = zzc(r0, r6)
            return r5
        Lfb:
            return r1
        Lfc:
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r6 = r6.zzi()
            r0.<init>(r6)
            boolean r5 = zzc(r5, r0)     // Catch: java.lang.Throwable -> L10b
            return r5
        L10a:
            return r2
        L10b:
            r5 = move-exception
            throw r5
    }

    private static boolean zzd(com.google.android.gms.internal.measurement.zzap r8, com.google.android.gms.internal.measurement.zzap r9) {
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.zzal
            if (r0 == 0) goto Le
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r8 = r8.zzi()
            r0.<init>(r8)
            r8 = r0
        Le:
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.zzal
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r9 = r9.zzi()
            r0.<init>(r9)
            r9 = r0
        L1c:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.zzat
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L37
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.zzat
            if (r0 != 0) goto L27
            goto L37
        L27:
            java.lang.String r8 = r8.zzi()
            java.lang.String r9 = r9.zzi()
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L36
            return r1
        L36:
            return r2
        L37:
            java.lang.Double r8 = r8.zzh()
            double r3 = r8.doubleValue()
            java.lang.Double r8 = r9.zzh()
            double r8 = r8.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L6d
            boolean r0 = java.lang.Double.isNaN(r8)
            if (r0 == 0) goto L54
            goto L6d
        L54:
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L5e
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 == 0) goto L65
        L5e:
            if (r0 != 0) goto L66
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L65
            goto L66
        L65:
            return r2
        L66:
            int r8 = java.lang.Double.compare(r3, r8)
            if (r8 >= 0) goto L6d
            return r1
        L6d:
            return r2
    }

    private static boolean zze(com.google.android.gms.internal.measurement.zzap r4, com.google.android.gms.internal.measurement.zzap r5) {
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzal
            if (r0 == 0) goto Le
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r4 = r4.zzi()
            r0.<init>(r4)
            r4 = r0
        Le:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzal
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r5 = r5.zzi()
            r0.<init>(r5)
            r5 = r0
        L1c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzat
            r1 = 0
            if (r0 == 0) goto L25
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzat
            if (r0 != 0) goto L41
        L25:
            java.lang.Double r0 = r4.zzh()
            double r2 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L49
            java.lang.Double r0 = r5.zzh()
            double r2 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L49
        L41:
            boolean r4 = zzd(r5, r4)
            if (r4 != 0) goto L49
            r4 = 1
            return r4
        L49:
            return r1
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String r4, com.google.android.gms.internal.measurement.zzg r5, java.util.List r6) {
            r3 = this;
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzh.zze(r4)
            java.lang.String r0 = r0.name()
            r1 = 2
            com.google.android.gms.internal.measurement.zzh.zzh(r0, r1, r6)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r5.zzb(r0)
            r1 = 1
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.measurement.zzap r6 = (com.google.android.gms.internal.measurement.zzap) r6
            com.google.android.gms.internal.measurement.zzap r5 = r5.zzb(r6)
            com.google.android.gms.internal.measurement.zzbl r6 = com.google.android.gms.internal.measurement.zzh.zze(r4)
            int r6 = r6.ordinal()
            r2 = 23
            if (r6 == r2) goto L66
            r2 = 48
            if (r6 == r2) goto L61
            r2 = 42
            if (r6 == r2) goto L5c
            r2 = 43
            if (r6 == r2) goto L57
            switch(r6) {
                case 37: goto L52;
                case 38: goto L4d;
                case 39: goto L48;
                case 40: goto L42;
                default: goto L3d;
            }
        L3d:
            com.google.android.gms.internal.measurement.zzap r4 = super.zzb(r4)
            return r4
        L42:
            boolean r4 = com.google.android.gms.internal.measurement.zzh.zzl(r0, r5)
        L46:
            r4 = r4 ^ r1
            goto L6a
        L48:
            boolean r4 = com.google.android.gms.internal.measurement.zzh.zzl(r0, r5)
            goto L6a
        L4d:
            boolean r4 = zze(r5, r0)
            goto L6a
        L52:
            boolean r4 = zzd(r5, r0)
            goto L6a
        L57:
            boolean r4 = zze(r0, r5)
            goto L6a
        L5c:
            boolean r4 = zzd(r0, r5)
            goto L6a
        L61:
            boolean r4 = zzc(r0, r5)
            goto L46
        L66:
            boolean r4 = zzc(r0, r5)
        L6a:
            if (r4 == 0) goto L6f
            com.google.android.gms.internal.measurement.zzap r4 = com.google.android.gms.internal.measurement.zzap.zzk
            goto L71
        L6f:
            com.google.android.gms.internal.measurement.zzap r4 = com.google.android.gms.internal.measurement.zzap.zzl
        L71:
            return r4
    }
}
