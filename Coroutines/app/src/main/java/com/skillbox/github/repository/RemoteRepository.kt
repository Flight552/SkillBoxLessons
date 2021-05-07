package com.skillbox.github.repository

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RemoteRepository(
    val id: Long? = null,
    val node_id: String? = null,
    val name: String? = null,
    val full_name: String? = null,
    val private: Boolean = false,
    val owner: RemoteUser,
    val html_url: String? = null,
    val description: String? = null,
    val fork: Boolean = false,
    val url: String?,
    val archive_url: String? = null,
    val assignees_url: String? = null,
    val blobs_url: String? = null,
    val branches_url: String? = null,
    val collaborators_url: String? = null,
    val comments_url: String? = null,
    val commits_url: String? = null,
    val compare_url: String? = null,
    val contents_url: String? = null,
    val contributors_url: String? = null,
    val deployments_url: String? = null,
    val downloads_url: String? = null,
    val events_url: String? = null,
    val forks_url: String? = null,
    val git_commits_url: String? = null,
    val git_refs_url: String? = null,
    val git_tags_url: String? = null,
    val git_url: String? = null,
    val issue_comment_url: String? = null,
    val issue_events_url: String? = null,
    val issues_url: String? = null,
    val keys_url: String? = null,
    val labels_url: String? = null,
    val languages_url: String? = null,
    val merges_url: String? = null,
    val milestones_url: String? = null,
    val notifications_url: String? = null,
    val pulls_url: String? = null,
    val releases_url: String? = null,
    val ssh_url: String? = null,
    val stargazers_url: String? = null,
    val statuses_url: String? = null,
    val subscribers_url: String? = null,
    val subscription_url: String? = null,
    val tags_url: String? = null,
    val teams_url: String? = null,
    val trees_url: String? = null,
    val clone_url: String? = null,
    val mirror_url: String? = null,
    val hooks_url: String? = null,
    val svn_url: String? = null,
    val homepage: String? = null,
    val language: String? = null,
    val forks_count: Int? = null,
    val stargazers_count: Int? = null,
    val watchers_count: Int? = null,
    val size: Int? = null,
    val default_branch: String? = null,
    val open_issues_count: Int? = null,
    val is_template: Boolean = false,
    val topics: List<String>,
    val has_issues: Boolean = false,
    val has_projects: Boolean = false,
    val has_wiki: Boolean = false,
    val has_pages: Boolean = false,
    val has_downloads: Boolean = false,
    val archived: Boolean = false,
    val disabled: Boolean = false,
    val visibility: String? = null,
    val pushed_at: String? = null,
    val created_at: String? = null,
    val updated_at: String? = null,
    val permissions: RemoteRepositoryPermissions,
    val allow_rebase_merge: Boolean = false,
    val template_repository: String? = null,
    val temp_clone_token: String? = null,
    val allow_squash_merge: Boolean = false,
    val delete_branch_on_merge: Boolean = false,
    val allow_merge_commit: Boolean = false,
    val subscribers_count: Int? = null,
    val network_count: Int? = null,
    val license: RemoteRepositoryLicense,
    val forks: Int? = null,
    val open_issues: Int? = null,
    val watchers: Int? = null
)
