create table Library_Book (
	bookId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	publisherId LONG,
	title STRING null,
	authorName VARCHAR(75) null,
	publicationDate DATE null
);

create table Library_Publisher (
	publisherId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	name VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	website VARCHAR(75) null,
	phoneNumber VARCHAR(75) null
);