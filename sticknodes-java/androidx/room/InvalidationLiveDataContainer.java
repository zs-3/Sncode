package androidx.room;

/* loaded from: classes.dex */
class InvalidationLiveDataContainer {
    private final androidx.room.RoomDatabase mDatabase;
    final java.util.Set<androidx.lifecycle.LiveData> mLiveDataSet;

    InvalidationLiveDataContainer(androidx.room.RoomDatabase r2) {
            r1 = this;
            r1.<init>()
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.mLiveDataSet = r0
            r1.mDatabase = r2
            return
    }
}
