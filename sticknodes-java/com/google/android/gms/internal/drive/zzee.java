package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzee extends com.google.android.gms.internal.drive.zzet {
    private static final com.google.android.gms.common.internal.GmsLogger zzbz = null;
    private final int zzda;
    private final com.google.android.gms.drive.events.zzi zzgt;
    private final com.google.android.gms.internal.drive.zzeg zzgu;
    private final java.util.List<java.lang.Integer> zzgv;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "EventCallback"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.android.gms.internal.drive.zzee.zzbz = r0
            return
    }

    public zzee(android.os.Looper r1, android.content.Context r2, int r3, com.google.android.gms.drive.events.zzi r4) {
            r0 = this;
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.zzgv = r3
            r3 = 1
            r0.zzda = r3
            r0.zzgt = r4
            com.google.android.gms.internal.drive.zzeg r3 = new com.google.android.gms.internal.drive.zzeg
            r4 = 0
            r3.<init>(r1, r2, r4)
            r0.zzgu = r3
            return
    }

    static /* synthetic */ com.google.android.gms.common.internal.GmsLogger zzai() {
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.internal.drive.zzee.zzbz
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzes
    public final void zzc(com.google.android.gms.internal.drive.zzfp r5) throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.drive.events.DriveEvent r5 = r5.zzat()
            int r0 = r4.zzda
            int r1 = r5.getType()
            r2 = 1
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            java.util.List<java.lang.Integer> r0 = r4.zzgv
            int r1 = r5.getType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            com.google.android.gms.internal.drive.zzeg r0 = r4.zzgu
            com.google.android.gms.drive.events.zzi r1 = r4.zzgt
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r5)
            android.os.Message r5 = r0.obtainMessage(r2, r3)
            r0.sendMessage(r5)
            return
    }

    public final void zzf(int r2) {
            r1 = this;
            java.util.List<java.lang.Integer> r2 = r1.zzgv
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            return
    }

    public final boolean zzg(int r2) {
            r1 = this;
            java.util.List<java.lang.Integer> r2 = r1.zzgv
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r2 = r2.contains(r0)
            return r2
    }
}
