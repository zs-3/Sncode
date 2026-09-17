package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzh {
    public static double zza(double r3) {
            boolean r0 = java.lang.Double.isNaN(r3)
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            boolean r0 = java.lang.Double.isInfinite(r3)
            if (r0 != 0) goto L27
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L27
            if (r0 != 0) goto L16
            goto L27
        L16:
            if (r0 <= 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = -1
        L1b:
            double r3 = java.lang.Math.abs(r3)
            double r3 = java.lang.Math.floor(r3)
            double r0 = (double) r0
            double r0 = r0 * r3
            return r0
        L27:
            return r3
    }

    public static int zzb(double r3) {
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L29
            boolean r0 = java.lang.Double.isInfinite(r3)
            if (r0 != 0) goto L29
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            goto L29
        L13:
            if (r2 <= 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = -1
        L18:
            double r3 = java.lang.Math.abs(r3)
            double r3 = java.lang.Math.floor(r3)
            double r0 = (double) r0
            double r0 = r0 * r3
            r3 = 4751297606875873280(0x41f0000000000000, double:4.294967296E9)
            double r0 = r0 % r3
            long r3 = (long) r0
            int r4 = (int) r3
            return r4
        L29:
            r3 = 0
            return r3
    }

    public static int zzc(com.google.android.gms.internal.measurement.zzg r5) {
            java.lang.String r0 = "runtime.counter"
            com.google.android.gms.internal.measurement.zzap r1 = r5.zzd(r0)
            java.lang.Double r1 = r1.zzh()
            double r1 = r1.doubleValue()
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = r1 + r3
            int r1 = zzb(r1)
            r2 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 > r2) goto L28
            double r2 = (double) r1
            com.google.android.gms.internal.measurement.zzah r4 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r4.<init>(r2)
            r5.zzg(r0, r4)
            return r1
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Instructions allowed exceeded"
            r5.<init>(r0)
            throw r5
    }

    public static long zzd(double r2) {
            int r2 = zzb(r2)
            long r2 = (long) r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            return r2
    }

    public static com.google.android.gms.internal.measurement.zzbl zze(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L11
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L11
            int r0 = java.lang.Integer.parseInt(r3)
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzbl.zza(r0)
        L11:
            if (r0 == 0) goto L14
            return r0
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "Unsupported commandId %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    public static java.lang.Object zzf(com.google.android.gms.internal.measurement.zzap r2) {
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzg
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzf
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L15
            java.lang.String r2 = ""
            return r2
        L15:
            boolean r0 = r2 instanceof com.google.android.gms.internal.measurement.zzam
            if (r0 == 0) goto L20
            com.google.android.gms.internal.measurement.zzam r2 = (com.google.android.gms.internal.measurement.zzam) r2
            java.util.Map r2 = zzg(r2)
            return r2
        L20:
            boolean r0 = r2 instanceof com.google.android.gms.internal.measurement.zzae
            if (r0 == 0) goto L46
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.zzae r2 = (com.google.android.gms.internal.measurement.zzae) r2
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r2.next()
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            java.lang.Object r1 = zzf(r1)
            if (r1 == 0) goto L2f
            r0.add(r1)
            goto L2f
        L45:
            return r0
        L46:
            java.lang.Double r0 = r2.zzh()
            boolean r0 = r0.isNaN()
            if (r0 != 0) goto L55
            java.lang.Double r2 = r2.zzh()
            return r2
        L55:
            java.lang.String r2 = r2.zzi()
            return r2
    }

    public static java.util.Map zzg(com.google.android.gms.internal.measurement.zzam r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.List r1 = r4.zzb()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.measurement.zzap r3 = r4.zzf(r2)
            java.lang.Object r3 = zzf(r3)
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L27:
            return r0
    }

    public static void zzh(java.lang.String r3, int r4, java.util.List r5) {
            int r0 = r5.size()
            if (r0 != r4) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            r3 = 2
            int r4 = r5.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            java.lang.String r3 = "%s operation requires %s parameters found %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    public static void zzi(java.lang.String r3, int r4, java.util.List r5) {
            int r0 = r5.size()
            if (r0 < r4) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            r3 = 2
            int r4 = r5.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            java.lang.String r3 = "%s operation requires at least %s parameters found %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    public static void zzj(java.lang.String r3, int r4, java.util.List r5) {
            int r0 = r5.size()
            if (r0 > r4) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            r3 = 2
            int r4 = r5.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            java.lang.String r3 = "%s operation requires at most %s parameters found %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    public static boolean zzk(com.google.android.gms.internal.measurement.zzap r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.Double r6 = r6.zzh()
            boolean r1 = r6.isNaN()
            if (r1 != 0) goto L2c
            double r1 = r6.doubleValue()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L2c
            double r1 = r6.doubleValue()
            double r1 = java.lang.Math.floor(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L2c
            r6 = 1
            return r6
        L2c:
            return r0
    }

    public static boolean zzl(com.google.android.gms.internal.measurement.zzap r4, com.google.android.gms.internal.measurement.zzap r5) {
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r1 = r5.getClass()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzau
            r2 = 1
            if (r0 != 0) goto L6f
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzan
            if (r0 == 0) goto L1a
            goto L6f
        L1a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzah
            if (r0 == 0) goto L49
            java.lang.Double r0 = r4.zzh()
            double r2 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L48
            java.lang.Double r0 = r5.zzh()
            double r2 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 == 0) goto L3b
            goto L48
        L3b:
            java.lang.Double r4 = r4.zzh()
            java.lang.Double r5 = r5.zzh()
            boolean r4 = r4.equals(r5)
            return r4
        L48:
            return r1
        L49:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzat
            if (r0 == 0) goto L5a
            java.lang.String r4 = r4.zzi()
            java.lang.String r5 = r5.zzi()
            boolean r4 = r4.equals(r5)
            return r4
        L5a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzaf
            if (r0 == 0) goto L6b
            java.lang.Boolean r4 = r4.zzg()
            java.lang.Boolean r5 = r5.zzg()
            boolean r4 = r4.equals(r5)
            return r4
        L6b:
            if (r4 != r5) goto L6e
            return r2
        L6e:
            return r1
        L6f:
            return r2
    }
}
