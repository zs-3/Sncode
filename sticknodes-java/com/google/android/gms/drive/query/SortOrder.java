package com.google.android.gms.drive.query;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SortOrderCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public class SortOrder extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.SortOrder> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    private final java.util.List<com.google.android.gms.drive.query.internal.zzf> zzlw;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "false", id = 2)
    private final boolean zzlx;

    public static class Builder {
        private final java.util.List<com.google.android.gms.drive.query.internal.zzf> zzlw;
        private boolean zzlx;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zzlw = r0
                r0 = 0
                r1.zzlx = r0
                return
        }

        public com.google.android.gms.drive.query.SortOrder.Builder addSortAscending(com.google.android.gms.drive.metadata.SortableMetadataField r4) {
                r3 = this;
                java.util.List<com.google.android.gms.drive.query.internal.zzf> r0 = r3.zzlw
                com.google.android.gms.drive.query.internal.zzf r1 = new com.google.android.gms.drive.query.internal.zzf
                java.lang.String r4 = r4.getName()
                r2 = 1
                r1.<init>(r4, r2)
                r0.add(r1)
                return r3
        }

        public com.google.android.gms.drive.query.SortOrder.Builder addSortDescending(com.google.android.gms.drive.metadata.SortableMetadataField r4) {
                r3 = this;
                java.util.List<com.google.android.gms.drive.query.internal.zzf> r0 = r3.zzlw
                com.google.android.gms.drive.query.internal.zzf r1 = new com.google.android.gms.drive.query.internal.zzf
                java.lang.String r4 = r4.getName()
                r2 = 0
                r1.<init>(r4, r2)
                r0.add(r1)
                return r3
        }

        public com.google.android.gms.drive.query.SortOrder build() {
                r3 = this;
                com.google.android.gms.drive.query.SortOrder r0 = new com.google.android.gms.drive.query.SortOrder
                java.util.List<com.google.android.gms.drive.query.internal.zzf> r1 = r3.zzlw
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    static {
            com.google.android.gms.drive.query.zzc r0 = new com.google.android.gms.drive.query.zzc
            r0.<init>()
            com.google.android.gms.drive.query.SortOrder.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    SortOrder(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.util.List<com.google.android.gms.drive.query.internal.zzf> r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zzlw = r1
            r0.zzlx = r2
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.List<com.google.android.gms.drive.query.internal.zzf> r2 = r4.zzlw
            java.lang.String r3 = ","
            java.lang.String r2 = android.text.TextUtils.join(r3, r2)
            r3 = 0
            r1[r3] = r2
            boolean r2 = r4.zzlx
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "SortOrder[%s, %s]"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.util.List<com.google.android.gms.drive.query.internal.zzf> r0 = r3.zzlw
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            boolean r0 = r3.zzlx
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
