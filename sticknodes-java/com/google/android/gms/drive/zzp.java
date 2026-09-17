package com.google.android.gms.drive;

@com.google.android.gms.common.internal.ShowFirstParty
/* loaded from: classes.dex */
public final class zzp extends com.google.android.gms.drive.ExecutionOptions.Builder {
    private boolean zzat;

    public zzp() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zzat = r0
            return
    }

    @Override // com.google.android.gms.drive.ExecutionOptions.Builder
    public final /* synthetic */ com.google.android.gms.drive.ExecutionOptions build() {
            r7 = this;
            r7.zzo()
            com.google.android.gms.drive.zzn r6 = new com.google.android.gms.drive.zzn
            java.lang.String r1 = r7.zzaq
            boolean r2 = r7.zzar
            int r3 = r7.zzas
            boolean r4 = r7.zzat
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // com.google.android.gms.drive.ExecutionOptions.Builder
    public final /* synthetic */ com.google.android.gms.drive.ExecutionOptions.Builder setConflictStrategy(int r1) {
            r0 = this;
            super.setConflictStrategy(r1)
            return r0
    }

    @Override // com.google.android.gms.drive.ExecutionOptions.Builder
    public final /* synthetic */ com.google.android.gms.drive.ExecutionOptions.Builder setNotifyOnCompletion(boolean r1) {
            r0 = this;
            super.setNotifyOnCompletion(r1)
            return r0
    }

    @Override // com.google.android.gms.drive.ExecutionOptions.Builder
    public final /* synthetic */ com.google.android.gms.drive.ExecutionOptions.Builder setTrackingTag(java.lang.String r1) {
            r0 = this;
            super.setTrackingTag(r1)
            return r0
    }
}
