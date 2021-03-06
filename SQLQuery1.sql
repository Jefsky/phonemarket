USE [master]
GO
/****** Object:  Database [phonemarket]    Script Date: 2014/6/27 4:16:15 ******/
CREATE DATABASE [phonemarket]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'phonemarket', FILENAME = N'E:\J2EE\cellphone store\phonemarket\phonemarket.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'phonemarket_log', FILENAME = N'E:\J2EE\cellphone store\phonemarket\phonemarket_log.ldf' , SIZE = 3136KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [phonemarket] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [phonemarket].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [phonemarket] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [phonemarket] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [phonemarket] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [phonemarket] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [phonemarket] SET ARITHABORT OFF 
GO
ALTER DATABASE [phonemarket] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [phonemarket] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [phonemarket] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [phonemarket] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [phonemarket] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [phonemarket] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [phonemarket] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [phonemarket] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [phonemarket] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [phonemarket] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [phonemarket] SET  DISABLE_BROKER 
GO
ALTER DATABASE [phonemarket] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [phonemarket] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [phonemarket] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [phonemarket] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [phonemarket] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [phonemarket] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [phonemarket] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [phonemarket] SET RECOVERY FULL 
GO
ALTER DATABASE [phonemarket] SET  MULTI_USER 
GO
ALTER DATABASE [phonemarket] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [phonemarket] SET DB_CHAINING OFF 
GO
ALTER DATABASE [phonemarket] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [phonemarket] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
EXEC sys.sp_db_vardecimal_storage_format N'phonemarket', N'ON'
GO
USE [phonemarket]
GO
/****** Object:  Table [dbo].[company]    Script Date: 2014/6/27 4:16:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[company](
	[companyid] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NULL,
	[address] [nvarchar](50) NULL,
	[website] [nvarchar](50) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[employee]    Script Date: 2014/6/27 4:16:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[employee](
	[employeeid] [int] NOT NULL,
	[name] [nvarchar](50) NULL,
	[password] [nvarchar](50) NULL,
	[gender] [nvarchar](50) NULL,
	[address] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[phone] [nvarchar](50) NULL,
	[task] [nvarchar](50) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[orderdetail]    Script Date: 2014/6/27 4:16:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[orderdetail](
	[id] [int] NULL,
	[orderid] [nvarchar](50) NULL,
	[phoneid] [nvarchar](50) NULL,
	[phonename] [nvarchar](50) NULL,
	[name] [nchar](50) NULL,
	[company] [nvarchar](50) NULL,
	[unitprice] [float] NULL,
	[ordernum] [int] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[orderform]    Script Date: 2014/6/27 4:16:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[orderform](
	[orderid] [nvarchar](50) NOT NULL,
	[orderdate] [datetime] NULL,
	[userid] [nvarchar](50) NULL,
	[totalnum] [nvarchar](50) NULL,
	[totalamount] [nvarchar](50) NULL,
	[payment] [nvarchar](50) NULL,
	[deliver] [nvarchar](50) NULL,
	[receiver] [nvarchar](50) NULL,
	[address] [nvarchar](50) NULL,
	[phone] [nvarchar](50) NULL,
	[postcode] [nvarchar](50) NULL,
	[state] [int] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[phone]    Script Date: 2014/6/27 4:16:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[phone](
	[phoneid] [int] NOT NULL,
	[phonename] [nvarchar](50) NULL,
	[platform] [nvarchar](50) NULL,
	[weight] [nvarchar](50) NULL,
	[display] [nvarchar](50) NULL,
	[camera] [nvarchar](50) NULL,
	[ram] [nvarchar](50) NULL,
	[massmenory] [nvarchar](50) NULL,
	[companyid] [int] NULL,
	[price] [float] NULL,
	[quantity] [int] NULL,
	[picture] [nvarchar](50) NULL,
	[type] [int] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[userinfo]    Script Date: 2014/6/27 4:16:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[userinfo](
	[userid] [nvarchar](50) NOT NULL,
	[username] [nvarchar](50) NULL,
	[password] [nvarchar](50) NULL,
	[gender] [nvarchar](50) NULL,
	[address] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[phone] [nvarchar](50) NULL,
	[postcode] [nvarchar](50) NULL,
	[state] [int] NULL
) ON [PRIMARY]

GO
USE [master]
GO
ALTER DATABASE [phonemarket] SET  READ_WRITE 
GO
