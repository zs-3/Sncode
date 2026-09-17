package com.google.android.gms.drive.query;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "QueryCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public class Query extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.Query> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    private final java.util.List<com.google.android.gms.drive.DriveSpace> zzby;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    private final com.google.android.gms.drive.query.internal.zzr zzlm;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final java.lang.String zzln;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final com.google.android.gms.drive.query.SortOrder zzlo;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    final java.util.List<java.lang.String> zzlp;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    final boolean zzlq;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    final boolean zzlr;

    @com.google.android.gms.common.util.VisibleForTesting
    public static class Builder {
        private java.lang.String zzln;
        private com.google.android.gms.drive.query.SortOrder zzlo;
        private java.util.List<java.lang.String> zzlp;
        private boolean zzlq;
        private boolean zzlr;
        private final java.util.List<com.google.android.gms.drive.query.Filter> zzls;
        private java.util.Set<com.google.android.gms.drive.DriveSpace> zzlt;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zzls = r0
                java.util.List r0 = java.util.Collections.emptyList()
                r1.zzlp = r0
                java.util.Set r0 = java.util.Collections.emptySet()
                r1.zzlt = r0
                return
        }

        public Builder(com.google.android.gms.drive.query.Query r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.zzls = r0
                java.util.List r1 = java.util.Collections.emptyList()
                r2.zzlp = r1
                java.util.Set r1 = java.util.Collections.emptySet()
                r2.zzlt = r1
                com.google.android.gms.drive.query.Filter r1 = r3.getFilter()
                r0.add(r1)
                java.lang.String r0 = r3.getPageToken()
                r2.zzln = r0
                com.google.android.gms.drive.query.SortOrder r0 = r3.getSortOrder()
                r2.zzlo = r0
                java.util.List<java.lang.String> r0 = r3.zzlp
                r2.zzlp = r0
                boolean r0 = r3.zzlq
                r2.zzlq = r0
                r3.zzbi()
                java.util.Set r0 = r3.zzbi()
                r2.zzlt = r0
                boolean r3 = r3.zzlr
                r2.zzlr = r3
                return
        }

        public com.google.android.gms.drive.query.Query.Builder addFilter(com.google.android.gms.drive.query.Filter r2) {
                r1 = this;
                java.lang.String r0 = "Filter may not be null."
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                boolean r0 = r2 instanceof com.google.android.gms.drive.query.internal.zzt
                if (r0 != 0) goto Le
                java.util.List<com.google.android.gms.drive.query.Filter> r0 = r1.zzls
                r0.add(r2)
            Le:
                return r1
        }

        public com.google.android.gms.drive.query.Query build() {
                r10 = this;
                com.google.android.gms.drive.query.Query r9 = new com.google.android.gms.drive.query.Query
                com.google.android.gms.drive.query.internal.zzr r1 = new com.google.android.gms.drive.query.internal.zzr
                com.google.android.gms.drive.query.internal.zzx r0 = com.google.android.gms.drive.query.internal.zzx.zzmv
                java.util.List<com.google.android.gms.drive.query.Filter> r2 = r10.zzls
                r1.<init>(r0, r2)
                java.lang.String r2 = r10.zzln
                com.google.android.gms.drive.query.SortOrder r3 = r10.zzlo
                java.util.List<java.lang.String> r4 = r10.zzlp
                boolean r5 = r10.zzlq
                java.util.Set<com.google.android.gms.drive.DriveSpace> r6 = r10.zzlt
                boolean r7 = r10.zzlr
                r8 = 0
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @java.lang.Deprecated
        public com.google.android.gms.drive.query.Query.Builder setPageToken(java.lang.String r1) {
                r0 = this;
                r0.zzln = r1
                return r0
        }

        public com.google.android.gms.drive.query.Query.Builder setSortOrder(com.google.android.gms.drive.query.SortOrder r1) {
                r0 = this;
                r0.zzlo = r1
                return r0
        }
    }

    static {
            com.google.android.gms.drive.query.zzb r0 = new com.google.android.gms.drive.query.zzb
            r0.<init>()
            com.google.android.gms.drive.query.Query.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    Query(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.drive.query.internal.zzr r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.drive.query.SortOrder r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.util.List<java.lang.String> r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.util.List<com.google.android.gms.drive.DriveSpace> r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) boolean r7) {
            r0 = this;
            r0.<init>()
            r0.zzlm = r1
            r0.zzln = r2
            r0.zzlo = r3
            r0.zzlp = r4
            r0.zzlq = r5
            r0.zzby = r6
            r0.zzlr = r7
            return
    }

    private Query(com.google.android.gms.drive.query.internal.zzr r9, java.lang.String r10, com.google.android.gms.drive.query.SortOrder r11, java.util.List<java.lang.String> r12, boolean r13, java.util.Set<com.google.android.gms.drive.DriveSpace> r14, boolean r15) {
            r8 = this;
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r14)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* synthetic */ Query(com.google.android.gms.drive.query.internal.zzr r1, java.lang.String r2, com.google.android.gms.drive.query.SortOrder r3, java.util.List r4, boolean r5, java.util.Set r6, boolean r7, com.google.android.gms.drive.query.zza r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public com.google.android.gms.drive.query.Filter getFilter() {
            r1 = this;
            com.google.android.gms.drive.query.internal.zzr r0 = r1.zzlm
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getPageToken() {
            r1 = this;
            java.lang.String r0 = r1.zzln
            return r0
    }

    public com.google.android.gms.drive.query.SortOrder getSortOrder() {
            r1 = this;
            com.google.android.gms.drive.query.SortOrder r0 = r1.zzlo
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.google.android.gms.drive.query.internal.zzr r2 = r4.zzlm
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.drive.query.SortOrder r2 = r4.zzlo
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = r4.zzln
            r3 = 2
            r1[r3] = r2
            java.util.List<com.google.android.gms.drive.DriveSpace> r2 = r4.zzby
            r3 = 3
            r1[r3] = r2
            java.lang.String r2 = "Query[%s,%s,PageToken=%s,Spaces=%s]"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.query.internal.zzr r1 = r4.zzlm
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r1 = r4.zzln
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            com.google.android.gms.drive.query.SortOrder r1 = r4.zzlo
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.util.List<java.lang.String> r6 = r4.zzlp
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r5, r1, r6, r3)
            boolean r6 = r4.zzlq
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            java.util.List<com.google.android.gms.drive.DriveSpace> r6 = r4.zzby
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r1, r6, r3)
            boolean r6 = r4.zzlr
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    public final java.util.Set<com.google.android.gms.drive.DriveSpace> zzbi() {
            r2 = this;
            java.util.List<com.google.android.gms.drive.DriveSpace> r0 = r2.zzby
            if (r0 != 0) goto La
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            return r0
        La:
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List<com.google.android.gms.drive.DriveSpace> r1 = r2.zzby
            r0.<init>(r1)
            return r0
    }
}
