package androidx.work.impl.model;

/* loaded from: classes.dex */
public interface DependencyDao {
    java.util.List<java.lang.String> getDependentWorkIds(java.lang.String r1);

    boolean hasCompletedAllPrerequisites(java.lang.String r1);

    boolean hasDependents(java.lang.String r1);

    void insertDependency(androidx.work.impl.model.Dependency r1);
}
