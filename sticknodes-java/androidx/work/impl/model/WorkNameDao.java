package androidx.work.impl.model;

/* loaded from: classes.dex */
public interface WorkNameDao {
    java.util.List<java.lang.String> getNamesForWorkSpecId(java.lang.String r1);

    void insert(androidx.work.impl.model.WorkName r1);
}
