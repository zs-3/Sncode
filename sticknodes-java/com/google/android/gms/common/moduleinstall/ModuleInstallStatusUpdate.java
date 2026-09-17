package com.google.android.gms.common.moduleinstall;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ModuleInstallStatusUpdateCreator")
/* loaded from: classes.dex */
public class ModuleInstallStatusUpdate extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSessionId", id = 1)
    private final int zaa;

    @com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.InstallState
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getInstallState", id = 2)
    private final int zab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getBytesDownloaded", id = 3)
    private final java.lang.Long zac;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTotalBytesToDownload", id = 4)
    private final java.lang.Long zad;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getErrorCode", id = 5)
    private final int zae;
    private final com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.ProgressInfo zaf;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface InstallState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 4;
        public static final int STATE_DOWNLOADING = 2;
        public static final int STATE_DOWNLOAD_PAUSED = 7;
        public static final int STATE_FAILED = 5;
        public static final int STATE_INSTALLING = 6;
        public static final int STATE_PENDING = 1;
        public static final int STATE_UNKNOWN = 0;
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static class ProgressInfo {
        private final long zaa;
        private final long zab;

        ProgressInfo(long r1, long r3) {
                r0 = this;
                r0.<init>()
                com.google.android.gms.common.internal.Preconditions.checkNotZero(r3)
                r0.zaa = r1
                r0.zab = r3
                return
        }

        public long getBytesDownloaded() {
                r2 = this;
                long r0 = r2.zaa
                return r0
        }

        public long getTotalBytesToDownload() {
                r2 = this;
                long r0 = r2.zab
                return r0
        }
    }

    static {
            com.google.android.gms.common.moduleinstall.zae r0 = new com.google.android.gms.common.moduleinstall.zae
            r0.<init>()
            com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    @com.google.android.gms.common.annotation.KeepForSdk
    public ModuleInstallStatusUpdate(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) @com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.InstallState int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.Long r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.Long r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r7) {
            r2 = this;
            r2.<init>()
            r2.zaa = r3
            r2.zab = r4
            r2.zac = r5
            r2.zad = r6
            r2.zae = r7
            if (r5 == 0) goto L2b
            if (r6 == 0) goto L2b
            long r3 = r6.longValue()
            r0 = 0
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 == 0) goto L2b
            com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$ProgressInfo r3 = new com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$ProgressInfo
            long r4 = r5.longValue()
            long r6 = r6.longValue()
            r3.<init>(r4, r6)
        L28:
            r2.zaf = r3
            return
        L2b:
            r3 = 0
            goto L28
    }

    public int getErrorCode() {
            r1 = this;
            int r0 = r1.zae
            return r0
    }

    @com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.InstallState
    public int getInstallState() {
            r1 = this;
            int r0 = r1.zab
            return r0
    }

    public com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.ProgressInfo getProgressInfo() {
            r1 = this;
            com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$ProgressInfo r0 = r1.zaf
            return r0
    }

    public int getSessionId() {
            r1 = this;
            int r0 = r1.zaa
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.getSessionId()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            int r0 = r3.getInstallState()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            java.lang.Long r0 = r3.zac
            r1 = 3
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(r4, r1, r0, r2)
            java.lang.Long r0 = r3.zad
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(r4, r1, r0, r2)
            int r0 = r3.getErrorCode()
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
